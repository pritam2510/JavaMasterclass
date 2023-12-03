import java.util.Scanner;

public class ReadingInputSystemConsoleChallenge {

    private static final Scanner scannerObj = new Scanner(System.in);

    public static void sumOfUserEnteredValue(int num) {
        int validNumCounter = 1;
        int sum = 0;

        System.out.println("Enter " + num + " valid integers and get there sum total.");
        do {
            System.out.println("Enter number #" + validNumCounter++ + ":");
            try {
                sum += Integer.parseInt(scannerObj.nextLine());
            } catch (NumberFormatException ex) {
                validNumCounter--;
                System.out.println("Please enter a valid integer. Try again !!");
            }
        } while (validNumCounter <= num);

        System.out.println("The sum is : " + sum);
    }

    public static void MinandMax() {
        double min = 0, max = 0;
        System.out.println("Enter numbers as many as you want and we will return the min and the max from the list : ");
        try {
            min = max = Double.parseDouble(scannerObj.nextLine());
        } catch (NumberFormatException ex) {
            System.out.println("Exiting !!");
            return;
        }
        while (true) {
            System.out.println("Enter another number or a character to exit: ");
            try {
                double curr = Double.parseDouble(scannerObj.nextLine());
                if (curr < min) min = curr;
                if (curr > max) max = curr;
            } catch (NumberFormatException ex) {
                System.out.println("Exiting !!");
                break;
            }
        }
        System.out.println(
                "The min value is " + min + "\n" +
                        "The max value is " + max
        );
    }

    public static void inputThenPrintSumAndAverage() {
        int sum = 0;
        int numCounter = 1;
        Scanner scannerObj = new Scanner(System.in);

        while (true) {
            System.out.println("Enter number #" + numCounter++ + " :");
            try {
                sum += Integer.parseInt(scannerObj.nextLine());
            } catch (NumberFormatException e) {
                numCounter--;
                break;
            }
        }
        System.out.println("SUM = " + sum + " AVG = " + Math.round((float) sum / numCounter));
    }

    public static int getBucketCount(double area, double areaPerBucket) {

        if (area <= 0 || areaPerBucket <= 0) return -1;
        return (int) Math.ceil(area / areaPerBucket);

    }

    public static int getBucketCount(double width, double height, double areaPerBucket, double extraBuckets) {

        if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0) return -1;
        return (int) Math.ceil((double) getBucketCount(width * height, areaPerBucket) - extraBuckets);
    }

    public static int getBucketCount(double width, double height, double areaPerBucket) {
        return getBucketCount(width, height, areaPerBucket, 0);
    }

    public static void main(String[] args) {
        //sumOfUserEnteredValue(5);
        //MinandMax();
        //inputThenPrintSumAndAverage();
        System.out.println(getBucketCount(7.25, 4.3, 2.35));
    }
}













































































