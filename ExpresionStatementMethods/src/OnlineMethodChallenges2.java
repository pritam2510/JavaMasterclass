public class OnlineMethodChallenges2 {
    public static void main(String[] args) {

    }

    // 1 CHALLENGE
    public class AreaCalculator {
        // write code here
        public static double area(double radius){
            if(radius < 0) return -1;
            return Math.PI * (radius * radius);
        }

        public static double area(double x, double y){
            if(x < 0 || y < 0) return -1;
            return x * y;
        }
    }

    // 2 CHALLENGE
    public class MinutesToYearsDaysCalculator {
        // write code here
        public static void printYearsAndDays (long minutes){
            if(minutes < 0){
                System.out.println("Invalid Value");
                return;
            }
            int years = (int)(minutes / 525600);
            int days = (int)((minutes % 525600) / 1440);

            System.out.println(minutes + " min = " + years + " y and " + days + " d");
        }
    }

    // 3 CHALLENGE
    public class IntEqualityPrinter {
        // write code here
        public static void printEqual (int x, int y, int z){
            if(x < 0 || y < 0 || z < 0){
                System.out.println("Invalid Value");
            }
            else if( x == y && x == z){
                System.out.println("All numbers are equal");
            }
            else if(x != y && x != z && y != z){
                System.out.println("All numbers are different");
            }
            else{
                System.out.println("Neither all are equal or different");
            }
        }
    }

    // 4 CHALLENGE
    public class PlayingCat {
        // write code here
        public static boolean isCatPlaying (boolean isSummer, int temperature){
            int lowTemp = 25;
            int highTemp = isSummer ? 45 : 35;

            return temperature >= lowTemp && temperature <= highTemp;
        }
    }
}
