public class TraditionalSwitchStatement {
    public static void main(String[] args) {
        //THE CODE USING ONLY IF-ELSE STATEMENT
        int value = 1;
        if (value == 1) {
            System.out.println("Value was 1");
        } else if (value == 2) {
            System.out.println("Value was 2");
        } else {
            System.out.println("Value was not 1 or 2");
        }

        //TRADITIONAL SWITCH STATEMENT
        /*
        * "value" is the variable whose value we want to test in the switch statement.
        * Each case represents on value against which we want to test the variable "value"
        * Followed by each case we can have a statement or code block which will be executed, if the case matches
        * We end the case with "break" statement which will break the switch statement and take the control out of switch block. This is optional but recommended.
        * At the last we have "default" case, which will execute if no case matches and this is generally mentioned at the end and therefore doesn't require a break. This too is optional.
        * We can even club multiple cases to have the same code block to execute by mentioning them one after other
        * eg: case 1: case 2: ... case n: followed by the common code block with just on break statement.
        * Make sure there is only one break for all the grouped cases, and we mention the cases without the multiple "break" statement (This is works because no break, so they leak down until they find a break).
        * Now as we mentioned that "break" is optional, what happens we don't mention break, is that once a case is matched, and it has no "break", the control will keep falling down all the other cases after it until it finds a break or the default case.
        * Switch can be used only with following data types:
        * byte, short, int, char
        * Byte, Short, Integer, Character
        * String
        * enum
        */
        /*
         *   switch(value) {
         *       case x:
         *           //code for value == x
         *           break;
         *       case y:
         *           //code for value == y
         *           break;
         *       .....
         *      case n:
         *           //code for value == n
         *           break;
         *      default:
         *           //code that will execute if no case matches
         */

        // ABOVE CODE IN SWITCH

        int switchValue = 9;

        switch (switchValue) {
            case 1:
                System.out.println("value was 1");
                break;
            case 2:
                System.out.println("value was 2");
                break;
            case 3: case 4: case 5:
                System.out.println("value could be a 3, or a 4, or a 5, because cases 3,4,5 are clubbed together");
                System.out.println("Actual value was " + switchValue);
                break;
            case 6:
                System.out.println("value was 6 and since it has no break it will leak down to 7 and 8 until it finds a break");
            case 7: case 8:
                System.out.println("value could be a 6 or a 7, or a 8");
                System.out.println("Actual value was " + switchValue);
                break;
            case 9:
                System.out.println("value was 9 and since there is no break it will leak down to 10 (again no break) and then to default");
            case 10:
                System.out.println("value was 10 and since there is no break it will leak down to default");
            default:
                System.out.println("value was not between 1 to 10");
        }

        switchValue = 3;
        switch (switchValue) {
            case 1 -> System.out.println("value was 1");
            case 2 -> System.out.println("value was 2");
            case 3, 4, 5 -> {
                System.out.println("value could be a 3, or a 4, or a 5, because cases 3,4,5 are clubbed together");
                System.out.println("Actual value was " + switchValue);
            }
            default -> System.out.println("value was not between 1 to 10");
        }
    }
}
