public class Methods {
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800,
                leveCompleted = 5,
                bonus = 100;
        int finalScore = score;

        if (gameOver) {
            finalScore += (leveCompleted * bonus);
            finalScore += 1000;
            System.out.println("Your final score was : " + finalScore);
        }

        score = 10000;
        leveCompleted = 8;
        bonus = 200;
        finalScore = score;

        /* EVEN THOUGH THE LOGIC TO CALCULATE THE FINAL RESULT WAS SAME IN BOTH SET OF VARIABLES
         * SO WE JUST COPIED THE SAME CODE IN BOTH PLACES. -- WHICH IS NOT THE RIGHT APPROACH--
         * BECAUSE WHENEVER WE WANT TO CHANGE THE LOGIC TO CALCULATE FINAL SCORE, WE MUST NOW UPDATE ALL THE PLACES WE HAVE COPIED IT
         * AND THIS COULD RESULT IN AN LOGICAL ERROR IF WE MISS IT IN ONE PLACE AS YOU CAN SEE IN THE EXAMPLE
         * SIMPLE SOLUTION IS TO CREATE A METHOD TO CALCULATE THE FINAL SCORE AND CALL THE METHOD WHERE-EVER WE NEED IT.
         * AND WE NEED TO CHANGE THE LOGIC THEN WE NEED TO CHANGE IT ONLY IN ONE PLACE
         */
        if (gameOver) {
            finalScore += (leveCompleted * bonus);
            System.out.println("Your final score was : " + finalScore);
        }

        /*
         * NOW USING A METHOD TO CALCULATE THE FINAL SCORE IT GETS MUCH EASIER TO MAINTAIN AND CHANGE THE CODE AND
         * THERE IS NO DUPLICATION OF THE CODE AS EVERYTHING WE NEED IS IN THE METHOD AND WE CALL THE METHOD WHENEVER WE REQUIRE IT.
         */
        // CASE 1
        gameOver = true;
        score = 800;
        leveCompleted = 5;
        bonus = 100;

        // Passing variables to methods
        calculateFinalScore(gameOver, score, leveCompleted, bonus);

        // CASE 2
        score = 10000;
        leveCompleted = 8;
        bonus = 200;

        // Passing all literals to methods
        calculateFinalScore(true,10000,8,200);

        // Passing a combination of variables and literals to methods
        calculateFinalScore(gameOver,10000,leveCompleted,200);

        /*
        * METHODS CAN ALSO RETURN VALUES BACK TO THE CALL STATEMENT.
        * I.E. A METHOD CAN PERFORM SOME TASK AND RETURN THE VALUE TO THE PLACE WHERE IT WAS CALLED.
        * TO DO THIS WE NEED TO MENTION THE RETURN DATA TYPE IN METHOD DECLARATION.
        * WE DO THAT BY CHANGING THE "VOID" TO A DATA TYPE THAT WE WANT TO RETURN FROM METHOD (VOID MEANT WE ARE NOT RETURNING ANYTHING FROM THE METHOD)
        * NOW ONCE WE HAVE MENTIONED A RETURN TYPE IN THE DECLARATION, THEN THE METHOD MUST RETURN A VALUE FROM ALL EXIT POINTS AND THE VALUE MUST ALWAYS BE THE SAME TYPE AS THE RETURN TYPE MENTIONED IN THE DECLARATION.
        * IN ORDER TO RETURN A VALUE, WE USE THE "return" KEYWORD FOLLOWED BY THE VALUE TO BE RETURNED
        * WHEN A METHOD RETURNS A VALUE WE CAN ASSIGN THE VALUE TO A VARIABLE AT THE PLACE OF CALLING THE METHOD (BUT ITS IS OPTIONAL)
        * EX: DATATYPE VAR = METHOD_NAME( ARGS LIST )  ===> THE DATATYPE MUST BE SAME AS RETURN TYPE
        */
        finalScore = calculateScore(gameOver, score, leveCompleted, bonus);
        System.out.println("Your final score UPON RETURNING FROM METHOD : " + finalScore);

        System.out.println("Method called but return value not assigned and used in the code");
        calculateScore(gameOver, score, leveCompleted, bonus);
        System.out.println("Method called inside a another method and return value is printed directly " + calculateScore(gameOver, score, leveCompleted, bonus));

    }

    public static void calculateFinalScore(boolean gameOver, int score, int leveCompleted, int bonus) {
        int finalScore = score;
        if (gameOver) {
            finalScore += (leveCompleted * bonus);
            finalScore += 1000;
            System.out.println("Your final score was : " + finalScore);
        }
    }

    public static int calculateScore(boolean gameOver, int score, int leveCompleted, int bonus) {
        int finalScore = score;
        if (gameOver) {
            finalScore += (leveCompleted * bonus);
            finalScore += 1000;
            //System.out.println("Your final score CALCULATED INSIDE METHOD : " + finalScore);
        }
        return finalScore;
    }
}
