public class MethodOverloadingChallenge2 {
    public static void main(String[] args) {
        System.out.println(getDuration(3726));
        System.out.println(getDuration(3945));
        System.out.println(getDuration(65, 45));
    }

    public static String getDuration(int seconds) {
        if (seconds < 0) return "The seconds value must be greater than 0";
        return getDuration((seconds / 60), (seconds % 60));
    }

    public static String getDuration(int minutes, int seconds) {
        if (minutes < 0)
            return "The minutes value must be greater than 0";

        else if (seconds < 0 || seconds > 60)
            return "The seconds value must be grater than 0 and less than 59";

        return ((minutes / 60) < 10 ? "0" + (minutes / 60) : (minutes / 60)) + "h " +
                ((minutes % 60) < 10 ? "0" + (minutes % 60) : (minutes % 60)) + "m " +
                (seconds < 10 ? "0" + seconds : seconds) + "s";
    }
}
