public class IfKeywordAndCodeBlocks {
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 5000,
                leveCompleted = 5,
                bonus = 100;

        // ONLY IF STATEMENT
        if (score == 5000) {
            System.out.println("Your score was equal to 5000 and Your score is " + score);
        }

        // IF-ELSE STATEMENT WHERE IF PART FAILS
        if (score < 5000) {
            System.out.println("Your score was less than 5000 and your score is " + score);
        } else {
            System.out.println("Your score was either 5000 or greater. Your score is " + score);
        }

        // IF-ELSE STATEMENT WHERE IF PART SUCCEEDS AND ELSE IS NOT EVEN CHECKED
        if (score <= 5000) {
            System.out.println("Your score was less than or equal to 5000 and your score is " + score);
        } else {
            System.out.println("Your score was greater than 5000. Your score is " + score);
        }

        //IF-ELSEIF-ELSE STATEMENT
        //score = 4000; //FOR FIRST IF TO EXECUTE
        //score = 400; //FOR ELSEIF TO EXECUTE
        //score = 5000; //FOR ELSE TO EXECUTE
        if (score < 5000 && score > 1000) {
            System.out.println("Your score was less than 5000 but is greater than 1000.");
        } else if (score < 1000) {
            System.out.println("Your score was less than 1000.");
        } else {
            System.out.println("Your score was greater than 5000.");
        }
    }
}
