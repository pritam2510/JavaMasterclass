public class WhileLoopChallenge {
    public static void main(String[] args) {
        int loopControl = 5;
        int totalEvenNos = 0;
        while (loopControl <= 20) {
            if (isEvenNumber(loopControl)) {
                totalEvenNos++;
                System.out.print(loopControl + " ");
            }
            loopControl++;
            if (totalEvenNos == 5) {
                System.out.print("\nTotal number of even number found is " + totalEvenNos + " ");
                break;
            }
        }

        System.out.println("\nsumDigitWhile");
        System.out.println("Sum of digits of -19 = " + sumDigitWhile(-10));
        System.out.println("Sum of digits of 7 = " + sumDigitWhile(7));
        System.out.println("Sum of digits of 1000 = " + sumDigitWhile(1000));
        System.out.println("Sum of digits of 125 = " + sumDigitWhile(125));


        System.out.println("\nsumDigitFor");
        System.out.println("Sum of digits of -19 = " + sumDigitFor(-10));
        System.out.println("Sum of digits of 7 = " + sumDigitFor(7));
        System.out.println("Sum of digits of 1000 = " + sumDigitFor(1000));
        System.out.println("Sum of digits of 125 = " + sumDigitFor(125));

        System.out.println(getGreatestCommonDivisor(81, 153));
    }

    public static int getGreatestCommonDivisor(int first, int second) {
        if (first < 10 || second < 10) return -1;
        int counter = 0;
        int greatestCommonDivisor = 0;

        for (int i = (first < second ? first : second); i >= 1; i--) {
            if ((first % i == 0) && (second % i == 0)) {
                greatestCommonDivisor = i;
                counter++;
                break;
            }
        }
        System.out.println(counter);
        return greatestCommonDivisor;
    }

    public static boolean isEvenNumber(int num) {
        return num % 2 == 0;
    }

    public static int sumDigitWhile(int num) {
        int sum = 0;
        if (num < 0) return -1;
        while (num > 9) {
            sum += (num % 10);
            num /= 10;
        }
        return sum + num;
    }

    public static int sumDigitFor(int num) {
        int i, sum = 0;
        if (num < 0) return -1;
        for (i = num; i > 9; i /= 10) {
            sum += (i % 10);
        }
        return sum + i;
    }
}


































