public class OROperator {
    public static void main(String[] args) {
        int topScore = 100;
        int leastScore = 50;
        int myScore = 80;

        System.out.println("top score : " + topScore);
        System.out.println("least Score : " + leastScore);
        System.out.println("my Score : " + myScore);

        System.out.println("");
        System.out.println("|| operator (short circuit): only one its logical operand needs to bo true for it for the && to result in true. \n And it will only execute second operand only if the first one is false");

        if(myScore > leastScore || myScore < topScore){
            System.out.println("This will Print Because my score 80 is in between 50 and 100");
        }
        if(myScore > leastScore || myScore > topScore){
            System.out.println("This will also Print  Even though my score 80 is smaller than 100. Because || requires only one of the operand to be true");
        }
        if(myScore < leastScore || myScore > topScore){
            System.out.println("This will not Print  Because my score 80 is not less than 50 and 80 is not greater than 100. An both operand results in false");
        }

        System.out.println("| operator: with non boolean operand like int will behave as bitwise operator");
        System.out.println("| operator: both its logical(boolean) operand needs to bo true for it for the && to result in true \nAnd it will execute both the operands irrespective of the value of first operand ");
        boolean orRes = false;
        if(true || (orRes = true))
            System.out.println("Test");
        System.out.println("Value of x did not change to true: " + orRes);
        if(false | (orRes = true))
            System.out.println("Test");
        System.out.println("Value of x changed to true: " + orRes);
    }
}
