public class IfThen {
    public static void main(String[] args) {
        System.out.println("Hello, Pritam");
        System.out.println("");


        boolean isAlien = true;
        if (isAlien == false) {
            System.out.println("It is not an alien");
        }
        if (isAlien != false) {
            System.out.println("It is an alien");
        }


        System.out.println("");
        boolean isCodeBlock = true;
        System.out.println("isCodeBlock : " + isCodeBlock);
        System.out.println("");

        if (!isCodeBlock)
            System.out.println("This will not print as this is immediately after a false if statement");
        System.out.println("This will print as even though its immediately after a false if statement,\n because no block is used in the if statement and \n therefore only the first immediate statement is considered as \"then\" for the if");
        System.out.println("");
        if (isCodeBlock) {
            System.out.println("Now all the statement in this block will work");
            System.out.println("As the entire block is now considered as the \"then\" for the if statement");
            System.out.println("And the entire block including all the statements inside it will execute once the if statement is true");
        }

        System.out.println("");
        int topScore = 100;
        System.out.println("top score : " + topScore);

        if (topScore == 100) {
            System.out.println("This will print \n And top score is equal to 100 and we are checking for equal to using ==");
        }
        if (topScore != 100) {
            System.out.println("This will not print \n And top score is equal to 100 and we are checking for not equal to using !=");
        }
        if (topScore > 100) {
            System.out.println("This will not print \n And top score is equal to 100 and we are checking for greater than to using >");
        }
        if (topScore >= 100) {
            System.out.println("This will print \n And top score is equal to 100 and we are checking for greater than or equal to using >=");
        }
        if (topScore < 100) {
            System.out.println("This will print \n And top score is equal to 100 and we are checking for less than  to using >");
        }
        if (topScore <= 100) {
            System.out.println("This will print \n And top score is equal to 100 and we are checking for less than or equal to using <=");
        }





    }
}
