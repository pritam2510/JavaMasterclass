public class ForLoop {
    public static void main(String[] args) {
        //FOR LOOP
        /*
         * So for loop is one type of control flow keyword which is used to loop through a given statement or code block
         * The loop wil continue to repeat the process as long as a given condition is true and will stop as soon as the condition is false
         *
         * THE SYNTAX:
         *   for (int loopControl = 1; loopControl <= 10; loopControl++) {
         *       System.out.println(loopControl);
         *   }
         * int loopControl = 1; ==> This is the initialization step. This will be executed only once at the start of the for loop
         *
         * loopControl <= 10; ==> This is the condition which is checked everytime the code loops and if this is false the code stops, else it continues.
         *
         * loopControl++ ==> This is the step where we make change to the loopControl value, because we miss this step then the condition would never be false, and it will make an infinite loop. So this will execute everytime the code block is executed.
         *
         * ALL THE ABOVE STEPS ARE OPTIONAL AND CAN BE SKIPPED, BUT WE NEED TO ADD THE REQUIRED ";" FOR EACH STEP
         *
         *
         * For loops are generally used when we have general idea about the number iteration that is going to take place, i.e. we have an idea about the start and end of the loop control
         * */
        for (int loopControl = 1; loopControl <= 10; loopControl++) {
            System.out.print(loopControl + " ");
        }
        System.out.println("\n");
        System.out.println("WITHOUT USING FOR LOOP");
        System.out.println("10000 at 2% interest rate = " + calculateInterest(10000.0, 2.0));
        System.out.println("10000 at 3% interest rate = " + calculateInterest(10000.0, 3.0));
        System.out.println("10000 at 4% interest rate = " + calculateInterest(10000.0, 4.0));
        System.out.println("10000 at 5% interest rate = " + calculateInterest(10000.0, 5.0));

        System.out.println("\n");
        System.out.println("USING FOR LOOP");
        for (double interestRate = 2.0; interestRate <= 5.0; interestRate++) {
            System.out.println("10000 at " + interestRate + "% interest rate = " + calculateInterest(10000.0, interestRate));
        }

        System.out.println("\n");
        System.out.println("MINI CHALLENGE USING FOR LOOP");
        for (double interestRate = 7.5; interestRate <= 10.0; interestRate += 0.25) {
            System.out.println("$100.00 at " + interestRate + "% interest rate = $" + calculateInterest(100.0, interestRate));
        }

        /*
         * Basically the break the control out of the current code block that is running
         * */
        System.out.println("\n");
        System.out.println("USE OF BREAK FOR LOOP");
        for (double interestRate = 7.5; interestRate <= 10.0; interestRate += 0.25) {
            if (interestRate > 8.5) break;
            System.out.println("$100.00 at " + interestRate + "% interest rate = $" + calculateInterest(100.0, interestRate));
        }

        System.out.println("\n");
        System.out.println("PRIME NUMBERS");
        for (int i = 1; i <= 10; i += 1) {
            System.out.println(i + " is" + ((isPrime(i) ? "" : " not") + " a prime number"));
        }

        allPrimeUptoN(100);
        System.out.println("\n");
        primeCount(1000);
        System.out.println("\n");
        sum3and5Challenge();
    }

    public static double calculateInterest(double amount, double interestRate) {
        return (double) (amount * (interestRate / 100));
    }

    /*
     * CHECK THIS LINK TI UNDERSTAND THE REASON TO LIMIT THE ITERATIONS TO N/2
     *   https://www.simplilearn.com/tutorials/c-tutorial/c-program-for-prime-numbers#reason_for_iterating_the_loop_till_n2
     * */
    public static boolean isPrime(int num) {
        if (num <= 2) return num == 2;
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void allPrimeUptoN(int num) {
        boolean isPrime = false;
        System.out.print("2 ");
        for (int j = 3; j < num; j++) {
            isPrime = true;
            for (int i = 2; i <= j / 2; i++) {
                if (j % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) System.out.print(j + " ");

        }
    }

    //CHALLENGE
    public static void primeCount(int num) {
        int primeCounter = 0;
        for (int j = 2; j <= num; j++) {
            primeCounter = isPrime(j) ? primeCounter + 1 : primeCounter;
            //if (primeCounter == 3) break;
        }
        System.out.println("There are " + primeCounter + " prime numbers between 1 and " + num);
    }

    public static void sum3and5Challenge() {
        int sum = 0, counter = 0;
        for (int i = 1; i <= 1000; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                sum += i;
                counter++;
                System.out.print(i + " ");
                if(counter == 5) break;
            }
        }
        System.out.println("\nThe sum is " + sum + " and the count of numbers that met the condition are " + counter);
    }

}


























































