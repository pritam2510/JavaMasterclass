public class ANDOperator {
    public static void main(String[] args) {
        int topScore = 100;
        int leastScore = 50;
        int myScore = 80;
        System.out.println("top score : " + topScore);
        System.out.println("least Score : " + leastScore);
        System.out.println("my Score : " + myScore);

        System.out.println("");
        System.out.println("&& operator (short circuit): both its logical operand needs to bo true for it for the && to result in true. \n And it will only execute second operand only if the first one is true");

        if(myScore > leastScore && myScore < topScore){
            System.out.println("This will Print  Because my score 80 is in between 50 and 100");
        }
        if(myScore < leastScore && myScore > topScore){
            System.out.println("This will not Print Because my score 80 is not less than 50 and 80 is not greater than 100");
        }

        System.out.println("& operator: with non boolean operand like int will behave as bitwise operator");
        System.out.println("& operator: both its logical(boolean) operand needs to bo true for it for the && to result in true \nAnd it will execute both the operands irrespective of the value of first operand ");
        boolean andRes = false;
        if(false && (andRes = true))
            System.out.println("Test");
        System.out.println("Value of x did not change to true: " + andRes);
        if(false & (andRes = true))
            System.out.println("Test");
        System.out.println("Value of x changed to true: " + andRes);

        System.out.println("");
        System.out.println("");
    }
}
