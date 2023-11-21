public class MethodOverloadingChallenge1 {
    public static void main(String[] args) {
        System.out.println("10 inches are " + convertToCentimeters(10) + " centimeters");
        System.out.println("68 in = " + convertToCentimeters(68) + " cm");
        System.out.println("5 foot 7 inches are " + convertToCentimeters(5,7) + " centimeters");
        System.out.println("5 ft, 8 in = " + convertToCentimeters(5,8) + " cm");
    }

    public static double convertToCentimeters(int inches){
        return (double)(inches * 2.54);
    }

    public static double convertToCentimeters(int feet, int inches){
        return (double) convertToCentimeters(((feet * 12) + inches));
    }
}
