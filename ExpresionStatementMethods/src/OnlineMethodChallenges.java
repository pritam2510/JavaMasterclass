public class OnlineMethodChallenges {
    public static void main(String[] args) {

    }
    // 1 CHALLENGE
    public static void checkNumber (int num){
        System.out.println(num > 0 ? "positive" : (num < 0 ? "negative" : "zero"));
    }

    // 2 CHALLENGE
    public static long toMilesPerHour(double kmph) {
        if(kmph < 0) return -1;
        return (long)(Math.round(kmph / 1.609));
    }

    public static void printConversion (double kmph) {
        if(kmph < 0) {System.out.println("Invalid Value"); return; }
        System.out.println(kmph + " km/h = " + toMilesPerHour(kmph) + " mi/h");
    }

    // 3 CHALLENGE
    public static void printMegaBytesAndKiloBytes(int kb) {
        if(kb < 0){
            System.out.println("Invalid Value");
            return;
        }
        System.out.println(kb + " KB = " + (kb/1024) + " MB and " + (kb%1024) + " KB");
    }

    // 4 CHALLENGE
    public static boolean shouldWakeUp(boolean barking, int hourOfDay){
        if(hourOfDay < 0 || hourOfDay > 23){
            return false;
        }
        else if(hourOfDay < 8 || hourOfDay > 22){
            return  barking;
        }
        return false;
    }

    // 5 CHALLENGE
    public static boolean isLeapYear (int year){
        if(year < 1 || year > 9999) return false;
        else{
            if(year % 4 == 0){
                if(year % 100 == 0){
                    return year % 400 == 0;
                }
                else{
                    return true;
                }
            }
            else{
                return false;
            }
        }
    }

    // MUCH SIMPLIFIED VERSION FROM COMMENTS
    public static boolean isLeapYearSimplified(int year){
        if (year<1 || year>9999){
            return false;
        }else{
            return (year%4==0) && (year%100!=0) || year%400==0;
        }
    }

    // 6 CHALLENGE
    public static boolean areEqualByThreeDecimalPlaces (double first, double second){
        return (((int)(first * 1000)) == ((int)(second * 1000)));
    }

    // WITHOUT CASTING VERSION FROM COMMENTS
    public static boolean areEqualByThreeDecimalPlacesNoCasting(double value1, double value2){
        double val1 = value1*1000;
        double val2 = value2*1000;

        double diff = val1 - val2;

        return (diff > -1) && (diff < 1);
    }

    // 7 CHALLENGE
    public static boolean hasEqualSum (int a, int b, int c) {
        return c == a + b;
    }

    // 8 CHALLENGE
    public static boolean isTeen (int num){
        return num > 12 && num < 20;
    }

    public static boolean hasTeen  (int num1, int num2, int num3){
        return isTeen(num1) || isTeen(num2) || isTeen(num3);
    }
}
