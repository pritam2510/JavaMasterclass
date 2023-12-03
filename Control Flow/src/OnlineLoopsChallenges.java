import java.util.Scanner;

public class OnlineLoopsChallenges {
    public static void main(String[] args) {

    }
}

//Number Palindrome
class NumberPalindrome {
    // write code here
    public static boolean isPalindrome(int number) {
        int reverse = 0;
        int i = number = (number > 0 ? number : (-1 * number));
        while (i > 0) {
            reverse = (reverse * 10) + (i % 10);
            i /= 10;
        }
        return number == reverse;
    }
}


//First And Last Digit Sum
class FirstLastDigitSum {
    // write code here
    public static int sumFirstAndLastDigit(int num) {
        int sum = 0;
        int counter = 0;
        if (num < 0) return -1;
        if (num < 9) return num * 2;
        while (num > 9) {
            if (counter > 0) {
                num = num / 10;
                continue;
            }
            sum += num % 10;
            num = num / 10;
            counter++;
        }

        return sum + num;
    }

    public static int sumFirstAndLastDigitComment(int number) {
        if (number < 0) {
            return -1;
        }
        int lastDigit = number % 10;
        while (number >= 10) { // > single digit
            number /= 10;
        }
        return number + lastDigit;
    }
}


//Even Digit Sum
class EvenDigitSum {
    // write code here
    public static int getEvenDigitSum(int num) {
        if (num < 0) return -1;
        int sum = 0;
        while (num > 0) {
            int lastDigit = num % 10;
            if (lastDigit % 2 == 0) {
                sum += lastDigit;
            }
            num = num / 10;
        }
        return sum;
    }
}


//Shared Digit
class SharedDigit {
    // write code here
    public static boolean hasSharedDigit(int a, int b) {
        if (!(a > 9 && a < 100) || !(b > 9 && b < 100)) return false;

        return (((a % 10) == (b % 10)) || ((a % 10) == (b / 10)) || ((a / 10) == (b % 10)) || ((a / 10) == (b / 10)));
    }

    public static boolean hasSharedDigitComment(int num1, int num2) {
        return (num1 >= 10 && num1 <= 99 && num2 >= 10 && num2 <= 99) && (num1 % 10 == num2 % 10 || num1 % 10 == num2 / 10 || num1 / 10 == num2 % 10 || num1 / 10 == num2 / 10);
    }
}

//Last Digit Checker
class LastDigitChecker {
    // write code here
    public static boolean hasSameLastDigit(int a, int b, int c) {
        if (
                !isValid(a) ||
                        !isValid(b) ||
                        !isValid(c)
        )
            return false;
        return (
                (a % 10) == (b % 10) ||
                        (a % 10) == (c % 10) ||
                        (c % 10) == (b % 10)
        );
    }

    public static boolean hasSameLastDigitComment(int num1, int num2, int num3) {
        return (isValid(num1) && isValid(num2) && isValid(num3)) && (num1 % 10 == num2 % 10 || num1 % 10 == num3 % 10 || num2 % 10 == num3 % 10);
    }

    public static boolean isValid(int a) {
        return (a > 9 && a < 1001);
    }
}


//All Factors
class FactorPrinter {
    // write code here
    public static void printFactors(int num) {
        if (num < 1) {
            System.out.println("Invalid Value");
            return;
        }

        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                System.out.println(i);
            }
        }
        System.out.println(num);
    }
}


//Greatest Common Divisor
class GreatestCommonDivisor {
    // write code here
    public static int getGreatestCommonDivisor(int first, int second) {
        if (first < 10 || second < 10) return -1;

        int greatestCommonDivisor = 0;

        for (int i = 1; i <= (first < second ? first : second); i++) {
            if ((first % i == 0) && (second % i == 0)) {
                greatestCommonDivisor = i;
            }
        }
        return greatestCommonDivisor;
    }

    public static int getGreatestCommonDivisorEuclidean(int first, int second) {
        if (first < 10 || second < 10) {
            return -1;
        }

        while (second != 0) {
            int temp = second;
            second = first % second;
            first = temp;
        }

        return first;
    }

    public static int getGreatestCommonDivisorComment1(int first, int second) {
        if (first < 10 || second < 10) {
            return -1;
        }
        while (first != second) {
            if (first > second)
                first = first - second;
            else
                second = second - first;
        }
        return first;
    }

    public static int getGreatestCommonDivisorComment(int first, int second) {
        if (first < 10 || second < 10) {
            return -1;
        }

        for (int i = Math.min(first, second); i > 0; i--) {
            if (first % i == 0 && second % i == 0) {
                return i;
            }
        }
        return -1;
    }
}


//Perfect Number
class PerfectNumber {
    // write code here
    public static boolean isPerfectNumber(int num) {
        if (num < 1) return false;
        int sumOfDivisor = 0;
        for (int i = 1; i <= num / 2; i++) {
            sumOfDivisor = num % i == 0 ? sumOfDivisor + i : sumOfDivisor;
        }

        return sumOfDivisor == num;
    }
}


//Number To Words
class NumberToWords {
    // write code here
    public static void numberToWords(int num) {
        if (num < 0) {
            System.out.println("Invalid Value");
            return;
        }

        int reverseNum = reverse(num);
        for (int i = 0; i < getDigitCount(num); i++) {
            System.out.println(
                    switch ((reverseNum % 10)) {
                        case 1 -> "One";
                        case 2 -> "Two";
                        case 3 -> "Three";
                        case 4 -> "Four";
                        case 5 -> "Five";
                        case 6 -> "Six";
                        case 7 -> "Seven";
                        case 8 -> "Eight";
                        case 9 -> "Nine";
                        default -> "Zero";
                    }
            );
            reverseNum /= 10;
        }
    }

    public static int reverse(int num) {
        int reverseNum = 0;
        for (int i = num; i != 0; i /= 10) {
            reverseNum = (reverseNum * 10) + (i % 10);
        }
        return reverseNum;
    }

    public static int getDigitCount(int num) {
        int digitCount = 0;
        if (num < 0) {
            return -1;
        }
        if (num == 0) {
            return 1;
        }
        for (int i = num; i > 0; i /= 10) digitCount++;
        return digitCount;
    }

    //
    public static void numberToWordsComment(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
        }
        int reverseNumber = reverseComment(number);
        for (int i = 0; i < getDigitCountComment(number); i++) {
            System.out.println(
                    switch (reverseNumber % 10) {
                        case 1 -> "One";
                        case 2 -> "Two";
                        case 3 -> "Three";
                        case 4 -> "Four";
                        case 5 -> "Five";
                        case 6 -> "Six";
                        case 7 -> "Seven";
                        case 8 -> "Eight";
                        case 9 -> "Nine";
                        default -> "Zero";
                    });
            reverseNumber /= 10;
        }
    }

    public static int reverseComment(int number) {
        StringBuilder forward = new StringBuilder("" + Math.abs(number));
        StringBuilder reverse = forward.reverse();
        int result = Integer.valueOf(reverse.toString());
        return (number < 0) ? result * -1 : result;
    }

    public static int getDigitCountComment(int number) {
        return (number < 0) ? -1 : ("" + number).length();
    }
}


//Flour Pack Problem
class FlourPacker {

    private static final int BIG_WEIGHT = 5;

    public static boolean canPack(int bigCount, int smallCount, int goal) {

        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }

        boolean result = false;
        int totalBigWeight = bigCount * BIG_WEIGHT;
        if (totalBigWeight >= goal) {
            int remaining = goal % BIG_WEIGHT;
            if (smallCount >= remaining) {
                result = true;
            }
        } else {
            if (smallCount >= goal - totalBigWeight) {
                result = true;
            }
        }
        return result;
    }
}


//Largest Prime
class LargestPrime {
    // write code here
    public static int getLargestPrimeCourseSolution(int number) {

        if (number < 2) {
            return -1;
        }

        int factor = -1;
        for (int i = 2; i * i <= number; i++) {
            if (number % i != 0) {
                continue;
            }
            factor = i;
            while (number % i == 0) {
                number /= i;
            }
        }
        return number == 1 ? factor : number;
    }

    public static int getLargestPrimeFactorization(int number) {
        if (number < 2) {
            return -1;
        }

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                number /= i; // set number as the "matching pair"
                i--; // negate the i++ increment
            }
        }
        return number; // return prime number
    }

    public static int getLargestPrime(int num) {
        int maxPrime = -1;
        if (num == 2) return 2;
        if (num > 1) {
            for (int i = num; i > 1; i--) {
                if (num % i == 0) {
                    boolean isPrime = true;
                    for (int j = i - 1; j > 1; j--) {
                        if (i % j == 0) {
                            isPrime = false;
                            break;
                        }
                    }
                    if (isPrime) {
                        maxPrime = i;
                        break;
                    }
                }
            }
        }
        return maxPrime;
    }
}


//Diagonal Star
 class DiagonalStar {
    private static final String STAR = "*";
    private static final String SPACE = " ";

    public static void printSquareStarCourse(int number) {

        if (number < 5) {
            System.out.println("Invalid Value");
            return;
        }

        // Iterate over each row
        for (int row = 1; row <= number; row++) {
            // Iterate over each column
            for (int column = 1; column <= number; column++) {
                // if either row or column equals 1, assign true to isFirstRowOrColumn.
                boolean isFirstRowOrColumn = row == 1 || column == 1;
                // if either row or column equals number, assign true to isLastRowOrColumn.
                boolean isLastRowOrColumn = row == number || column == number;
                // if either row equals column, or column equals number minus row plus 1, assign true to isFirstRowOrColumn.
                boolean isDiagonal = (row == column) || (column == (number - row + 1));

                if (isFirstRowOrColumn || isLastRowOrColumn || isDiagonal) {
                    System.out.print(STAR);
                } else {
                    System.out.print(SPACE);
                }
            }
            // Move to the next line
            System.out.println();
        }
    }
    // write code here
    public static void printSquareStar(int num){
        if(num <5) {
            System.out.println("Invalid Value");
            return;
        }

        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                if(( i == 0 || i == num-1)||( j == 0 || j == num-1)||(i == j)||(j == (num - (i+1) ))){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
























































































