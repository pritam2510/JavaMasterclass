import java.util.Scanner;

public class ReadingInputSystemConsole {
    public static void main(String[] args) {
        int currentYear = 2023;
        String userDOB = "1995";

        /*
        The code below will run but the result will not be what expected
        * currentYear ==> int
        * userDOB ==> String
        *
        * And by default only "+" operator is overloaded for String to act as concatenation, such that when "+" is used with any one of the 2 operand as string, it will automatically convert the other operand to string
        */
        System.out.println("Even we have one operand of numeric data type + will concat as long as one operand is string");
        System.out.println("Sum of years = " + (currentYear + userDOB));
        /*
         * The code below will throw an error because
         * So when we use "-" since there is no overloading done it throws error
         * */
        // System.out.println("Age = " + (currentYear - userDOB));
        System.out.println("Read teh comments in the code to know why - doesn't work when we have either both or one operand as string");

        /*
         * The solution for this is to use special static methods provided by Java in each primitive data types wrapper class.
         * Now for Integer (int data type wrapper class), we have Integer.parseInt() which converts the string passed into a valid int value
         * */
        System.out.println("Using Integer.parseInt");
        System.out.println("Age = " + (currentYear - Integer.parseInt(userDOB)));

        /*
         * Now for Double (double data type wrapper class), we have Integer.parseDouble() which converts the string passed into a valid double value
         * */
        System.out.println("Using Double.parseDouble");
        String userAge = "27.5";
        System.out.println("Year of birth = " + (currentYear - Double.parseDouble(userAge)));

        try {
            System.out.println("Using System.console");
            System.out.println(getInputFromConsole(currentYear));
        } catch (NullPointerException e) {
            System.out.println("Using Scanner object");
            System.out.println(getInputFromScanner(currentYear));
        }
    }


    public static String getInputFromConsole(int currentYear) {
        String name = System.console().readLine("Hi, What is you name ??");
        System.out.println("Hello " + name);
        String DOB = System.console().readLine("Hi, what year were you born ??");
        return "So you are " + (currentYear - (Integer.parseInt(DOB))) + " years old";
    }

    public static String getInputFromScanner(int currentYear) {
        Scanner scanner = new Scanner(System.in);
        //String name = System.console().readLine("Hi, What is you name ??");
        System.out.println("Hi, What is you name ??");
        String name = scanner.nextLine();
        System.out.println("Hello " + name);

        //String DOB = System.console().readLine("Hi, what year were you born ??");
        System.out.println("Hi, what year were you born ??");
        int age = -1;
        do {
            System.out.println("Hi, enter a valid year of birth which is between (" + (currentYear - 125) + " and " + currentYear + ")");
            try {
                age = checkValidYearOfBirth(currentYear,scanner.nextLine());
            }catch (NumberFormatException ex){
                System.out.println("Hi, no characters allowed in year of birth. Please try again");
            }
        } while (age == -1);
        return "So you are " + age + " years old";
    }

    public static int checkValidYearOfBirth(int currentYear, String yearOfBirth) {
        int yearOfBirthNum = (Integer.parseInt(yearOfBirth));
        if (yearOfBirthNum < (currentYear - 125) || (yearOfBirthNum > currentYear)) {
            return -1;
        }
        return currentYear - yearOfBirthNum;
    }


}






























































































