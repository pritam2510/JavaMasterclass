public class OnlineSwitchChallenges {
    public static void main(String[] args) {

    }

    //CHALLENGE 1
    public static void printNumberInWord (int num){
        switch(num){
            case 0 -> System.out.println("ZERO");
            case 1 -> System.out.println("ONE");
            case 2 -> System.out.println("TWO");
            case 3 -> System.out.println("THREE");
            case 4 -> System.out.println("FOUR");
            case 5 -> System.out.println("FIVE");
            case 6 -> System.out.println("SIX");
            case 7 -> System.out.println("SEVEN");
            case 8 -> System.out.println("EIGHT");
            case 9 -> System.out.println("NINE");
            default -> System.out.println("OTHER");
        }
    }

    //ANOTHER SOLUTION
    public static void printNumberInWord1 (int number) {
        System.out.println(switch(number) {
            case 0 -> "ZERO";
            case 1 -> "ONE";
            case 2 -> "TWO";
            case 3 -> "THREE";
            case 4 -> "FOUR";
            case 5 -> "FIVE";
            case 6 -> "SIX";
            case 7 -> "SEVEN";
            case 8 -> "EIGHT";
            case 9 -> "NINE";
            default -> "OTHER";

        });

    }


    //CHALLENGE 2
    public static boolean isLeapYear (int year){
        if(year <= 0 || year >= 10000) return false;
        return (year % 4 == 0) && ((year % 100 != 0) || (year % 400 ==0));
    }

    public static int getDaysInMonth (int month, int year){
        if(year <= 0 || year >= 10000) return -1;
        return switch(month){
            case 1,3,5,7,8,10,12 -> 31;
            case 2 -> {
                if(isLeapYear(year)) yield 29 ;
                else yield 28;
            }
            case 4,6,9,11 -> 30;
            default -> -1;
        };
    }

    //ANSWER PROVIDED IN COURSE
    public static int getDaysInMonth1(int month, int year) {

        if (year < 1 || year > 9_999) {
            return -1;
        }

        return switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> 31;  // for any of the following months, return 31
            case 2 -> isLeapYear(year) ? 29 : 28; // if it's February, determine if it's a leap year first, then return either 28 or 29.
            case 4, 6, 9, 11 -> 30; // return 30 for the following months
            default -> -1; // return -1 if the month parameter is not between 1 and 12.
        };
    }
    public static boolean isLeapYear1(int year) {

        if (year < 1 || year > 9_999) {
            return false;
        }

        if (year % 4 == 0) {
            if (year % 100 != 0) {
                return true;
            } else {
                if (year % 400 == 0) {
                    return true;
                } else {
                    return false;
                }
            }
        } else {
            return false;
        }
    }

}
