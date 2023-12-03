import java.util.Scanner;

public class OnlineReadingInputSystemConsoleChallenge {
    public static void main(String[] args) {

    }
}

//Input Calculator
 class InputCalculator {
    // write code here
    public static void inputThenPrintSumAndAverage(){
        int sum = 0;
        int numCounter = 0;
        Scanner scannerObj = new Scanner(System.in);
        while(true){
            try {
                numCounter++;
                sum += Integer.parseInt(scannerObj.nextLine());
            } catch(NumberFormatException e) {
                numCounter--;
                break;
            }
        }
        System.out.println("SUM = " + sum + " AVG = " + Math.round((double)sum/numCounter));
    }
}


//Paint Job
 class PaintJob {
    // write code here
    public static int getBucketCount(double area, double areaPerBucket) {
        if (area <= 0 || areaPerBucket <= 0) return -1;
        return (int) Math.ceil(area / areaPerBucket);

    }

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0) return -1;
        return (int) Math.ceil(getBucketCount(width * height, areaPerBucket) - extraBuckets);
    }

    public static int getBucketCount(double width, double height, double areaPerBucket) {
        return getBucketCount(width, height, areaPerBucket, 0);
    }
}