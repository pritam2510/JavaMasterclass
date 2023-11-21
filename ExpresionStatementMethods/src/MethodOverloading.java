public class MethodOverloading {

    /*
    * METHOD OVERLOADING IS A TECHNIQUE IN JAVA WHERE WE CAN HAVE MULTIPLE DEFINITIONS
    * OF A METHOD WHICH DIFFERS ONLY IN THE METHOD SIGNATURE.
    * METHOD SIGNATURE: INCLUDES THE FOLLOWING
    * METHOD NAME,
    * DATA TYPE OF PARAMETERS
    * AND THE ORDER IN WHICH THE PARAMETER ARE MENTIONED
    * METHOD SIGNATURE: DOESN'T INCLUDE THE FOLLOWING
    * RETURN TYPE OF THE METHOD
    * THE PARAMETER NAMES
    */

    public static void main(String[] args) {
        System.out.println("Examples of method overloading");
        int newScore = calculateScore("Pritam", 500);
        System.out.println("New Score is " + newScore);
        calculateScore(75);
        calculateScore();

        System.out.println("------------------------------------------------------------------------------");
        System.out.println("THIS IS TO SHOW HOW METHOD OVERLOADING IS USED TO MIMIC DEFAULT PARAMETER IN JAVA");
        // THIS IS TO SHOW HOW METHOD OVERLOADING IS USED TO MIMIC DEFAULT PARAMETER IN JAVA
        System.out.println("New score is : " + calculateMarks("Pritam",100));
        System.out.println("New score is : " + calculateMarks(100));
        System.out.println("New score is : " + calculateMarks());
    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore( int score) {
        System.out.println("Unnamed player scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore() {
        System.out.println("No player scored, no player score");
        return 0;
    }

   /*
   SINCE THE ABOVE DEFINITION AND THIS METHOD DIFFERS ONLY BASED ON RETURN TYPE SO NOT VALID OVERLOADING
   public static void calculateScore() {
        System.out.println("No player scored, no player score");
    }
    */

    /*
    * JAVA DOESN'T SUPPORT DEFAULT PARAMETER LIKE C#
    * THEREFORE WE NEED TO USE METHOD OVERLOADING IN JAVA TO MIMIC DEFAULT PARAMETERS
    * CONSIDER THE EXAMPLE BELOW
    */

    public static int calculateMarks(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateMarks( int score) {
        return calculateMarks("Anonymous",score);
    }

    public static int calculateMarks() {
        return calculateMarks(0);
    }
}
