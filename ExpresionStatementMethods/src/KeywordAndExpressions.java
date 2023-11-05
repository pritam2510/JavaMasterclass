public class KeywordAndExpressions {
    public static void main(String[] args) {
        //Can not use keywords a name for variables, methods, classes etc. Using keywords other than their intended use
        // Un-comment the line below to check the error

        //int int = 5;

        double kiloMeter = (100 * 1.609344);
        // In Java a statement is a single unit of work/execution that might or might not result into a value. Expression is a single unit of execution which will always result into a single unit of value
        // This is a Statement:
        //double kiloMeter = (100 * 1.609344);
        //This is an Expression: where it is formed using a variable, 2 literal values and 2 operators
        // kiloMeter = (100 * 1.609344);


        int highScore = 50;
        /*
         * Statement ==> int highScore = 50
         * Expression ==>  highScore = 50
         */

        if (highScore > 25)
            /*
             * Statement ==> if (highScore > 25)
             * Expression ==>  highScore > 25
             */
        {
            highScore = highScore + 1000;
            /*
             * Statement ==> highScore = highScore + 1000;
             * Expression 1 ==>  highScore + 1000;
             * Expression 2 ==>  highScore = 1025;
             */
        }

        //List of Expressions in comments
        int health = 100;
        //health = 100 ==> 100
        if ((health < 25) && (highScore > 1000))
        //(health < 25) ==> false
        //(highScore > 1000) ==> true
        //health < 25) && (highScore > 1000) ==> false && true
        {
            highScore = highScore - 1000;
            //highScore - 1000 ==> 25
            //highScore = highScore - 1000; ==> highScore = 25;
        }
    }
}
