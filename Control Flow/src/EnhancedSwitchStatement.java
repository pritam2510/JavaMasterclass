public class EnhancedSwitchStatement {
    public static void main(String[] args) {
        //TRADITIONAL SWITCH STATEMENT
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

        int switchValue = 3;

        switch (switchValue) {
            case 1:
                System.out.println("value was 1");
                break;
            case 2:
                System.out.println("value was 2");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("value could be a 3, or a 4, or a 5, because cases 3,4,5 are clubbed together");
                System.out.println("Actual value was " + switchValue);
                break;
            default:
                System.out.println("value was not between 1 to 10");
        }

        //ENHANCED SWITCH CASE STATEMENT
        /*
         * There many more enhanced switch statements
         * This is the enhanced switch case statement to support backward compatibility
         *
         * Following is the syntax
         *   switch(value) {
         *       case x -> //code for value == x
         *       case y -> //code for value == y
         *       .....
         *      case a , b , c -> //code for value == a or b or c
         *      case n -> //code for value == n
         *      default -> code that will execute if no case matches
         *
         * Following are the changes from traditional
         * 1. The ":" after the case value is replaced with an arrow ->
         * 2. There is no need to use "break" statement at the end
         * 3. There is no chance of case fall-through and therefore no break needed
         * 4. Now instead of mentioning each grouped cases as with their own "case" keyword,
         *      we can mention them as a comma separated listed in with just single "case"
         *      keyword
         * 5. Enhanced switch statement can be used as an expression or as a statement (depending on what is done in the respective case blocks) in Java.
         * Therefore, you can see that in the getQuarterEnhancedSwitch() method where we are returning an enhanced switch statement
         * So when enhanced switch is used as expression every case in the switch must result in only one value and the data type must be same.
         * The enhanced switch must always have a default case (only exception is when enum type is used with switch)
         */

        switch (switchValue) {
            case 1 -> System.out.println("value was 1");
            case 2 -> System.out.println("value was 2");
            case 3, 4, 5 -> {
                System.out.println("value could be a 3, or a 4, or a 5, because cases 3,4,5 are clubbed together");
                System.out.println("Actual value was " + switchValue);
            }
            default -> System.out.println("value was not between 1 to 10");
        }

        System.out.println("APRIL is in the " + getQuarterTraditionalSwitch("APRIL") + " quarter");
        System.out.println("OCTOBER is in the " + getQuarterTraditionalSwitch("OCTOBER") + " quarter");

        System.out.println("APRIL is in the " + getQuarterEnhancedSwitch("APRIL") + " quarter");
        System.out.println("OCTOBER is in the " + getQuarterEnhancedSwitch("OCTOBER") + " quarter");

        System.out.println("OCTOBER is in the " + getQuarterEnhancedSwitchYeild("OCTOBER") + " quarter");
    }

    public static String getQuarterTraditionalSwitch(String month) {
        switch (month) {
            case "JANUARY":
            case "FEBRUARY":
            case "MARCH":
                return "1ST";
            case "APRIL":
            case "MAY":
            case "JUNE":
                return "2ND";
            case "JULY":
            case "AUGUST":
            case "SEPTEMBER":
                return "3RD";
            case "OCTOBER":
            case "NOVEMBER":
            case "DECEMBER":
                return "4TH";
        }
        return "BAD";
    }

    /* Enhanced switch statement can be used as an expression in Java.
     * Therefore, you can see that in the getQuarterEnhancedSwitch() method where we are returning an enhanced switch statement
     * So when enhanced switch is used as expression every case in the switch must result in only one value and the data type must be same for all them.
     * The enhanced switch must always have a default case, otherwise we will get error (only exception is when enum type is used with switch)
     */
    public static String getQuarterEnhancedSwitch(String month) {
        return switch (month) {
            case "JANUARY", "FEBRUARY", "MARCH" -> "1ST";
            case "APRIL", "MAY", "JUNE" -> "2ND";
            case "JULY", "AUGUST", "SEPTEMBER" -> "3RD";
            case "OCTOBER", "NOVEMBER", "DECEMBER" -> "4TH";
            default -> "BAD";
        };

        //THE FOLLOWING WILL ALSO WORK AS THE ABOVE FORM OF ENHANCED SWITCH IS BEHAVING LIKE AN EXPRESSION:
        /*
        * String res = switch (month) {
                case "JANUARY", "FEBRUARY", "MARCH" -> "1ST";
                case "APRIL", "MAY", "JUNE" -> "2ND";
                case "JULY", "AUGUST", "SEPTEMBER" -> "3RD";
                case "OCTOBER", "NOVEMBER", "DECEMBER" -> "4TH";
                default -> "BAD";
            };
            return  res;
         */
    }

    /*
    * We can have code block when we are using an enhanced switch statement, but to result in one single value from the code block we need to use
    * the "yield" keyword, which kinda behaves like return,
    * The yield keyword can be used only inside a code block
    * The following is implicitly translated to
    * case 1 -> "One"    to     case 1 -> { yield "One" }
    */
    public static String getQuarterEnhancedSwitchYeild(String month) {

        return switch (month) {
            case "JANUARY", "FEBRUARY", "MARCH" -> { yield "1ST"; }   //same as case "JANUARY", "FEBRUARY", "MARCH" -> "1ST";
            case "APRIL", "MAY", "JUNE" -> "2ND";
            case "JULY", "AUGUST", "SEPTEMBER" -> "3RD";
            case "OCTOBER", "NOVEMBER", "DECEMBER" -> "4TH";
            default -> {
                yield month + " is a BAD request";
            }
        };

        //THE FOLLOWING CODE WILL ALSO WORK
        /*
            String res = switch (month) {
                case "JANUARY", "FEBRUARY", "MARCH" -> "1ST";
                case "APRIL", "MAY", "JUNE" -> "2ND";
                case "JULY", "AUGUST", "SEPTEMBER" -> "3RD";
                case "OCTOBER", "NOVEMBER", "DECEMBER" -> "4TH";
                default -> {
                    yield month + " is a BAD request";
                }
            };

            return  res;
         */
    }

    // We can use return for all the code blocks here because in this case even though it appears to an expression but the switch is behaving like a statement
    public static String getPhoeneticAlphabet (char letter) {
        switch (letter) {
            case 'a' -> {return "alpha";}
            case 'b' -> {return "bravo";}
            case 'c' -> {return "charlie";}
            case 'd' -> {return "delta";}
            case 'e' -> {return "echo";}
            case 'f' -> {return "foxtrot";}
            case 'g' -> {return "golf";}
            case 'h' -> {return "hotel";}
            case 'i' -> {return "india";}
            case 'j' -> {return "juliet";}
            case 'k' -> {return "kilo";}
            case 'l' -> {return "lima";}
            case 'm' -> {return "mike";}
            case 'n' -> {return "november";}
            case 'o' -> {return "october";}
            case 'p' -> {return "papa";}
            case 'q' -> {return "quebec";}
            case 'r' -> {return "romeo";}
            case 's' -> {return "sierra";}
            case 't' -> {return "tango";}
            case 'u' -> {return "uniform";}
            case 'v' -> {return "victor";}
            case 'w' -> {return "whiskey";}
            case 'x' -> {return "xray";}
            case 'y' -> {return "yankee";}
            case 'z' -> {return "zulu";}
            case ' ' -> {return " ";}
            default -> {return "not in list";}
        }
    }
}
