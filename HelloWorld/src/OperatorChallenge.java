public class OperatorChallenge {
    public static void main(String[] args) {
        double first = 20.00;
        double second = 80.00;
        System.out.println("first value: "+ first);
        System.out.println("second value: "+ second);

        double add = (first + second) * 100;
        System.out.println("Total: "+ add);

        double remainder = add % 40.0;
        System.out.println("remainder : "+ remainder);

        boolean isNoRemainder = (remainder == 0.00) ? true : false;
        System.out.println("isNoRemainder : "+ isNoRemainder);

        if (!isNoRemainder) {
           System.out.println("got some remainder:" + remainder);
        }
    }
}
