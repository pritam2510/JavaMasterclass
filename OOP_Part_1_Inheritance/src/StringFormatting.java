public class StringFormatting {
    public static void main(String[] args) {
        String bulletString = "Print a Bulleted List: " +
                "\u2022 First Point " +
                "\u2022 Sub Point ";
        System.out.println(bulletString);

        System.out.println();
        System.out.println("-----------------------------");
        System.out.println();

        String bulletEscapedString = "Print a Bulleted List: \n" +
                "\t\u2022 First Point \n" +
                "\t\t\u2022 Sub Point ";
        System.out.println(bulletEscapedString);

        System.out.println();
        System.out.println("------------TEXT BLOCK WITH 3 DOUBLE QUOTES TO START AND END-----------------");
        System.out.println();

        String textBlockString = """
                Print a Bulleted List:
                            \u2022 First Point
                                \u2022 Sub Point
                            \u2022 Second Point
                """;
        System.out.println(textBlockString);

        System.out.println();
        System.out.println("-----printf and format methods-----");
        System.out.println();

        int age = 28;
        System.out.printf("Your age is %d \n", age);

        int yearOdBirth = 2023 - age;
        System.out.printf("Your age is %d %nBirth year is %d \n", age, yearOdBirth);

        System.out.printf("Your age is %f \n", (float)age);

        //decimal precision
        System.out.printf("Your age is %.2f \n", (float)age);

        for (int i = 1; i <= 100000; i *= 10){
            System.out.printf("Printing %d %n", i);
        }

        //Width spacing
        for (int i = 1; i <= 100000; i *= 10){
            System.out.printf("Printing %6d %n", i);
        }

        System.out.println("We can use format() method instead of printf in all the above examples. \nBelow are 2 examples");
        System.out.format("Your age is %f \n", (float)age);
        System.out.format("Your age is %.2f \n", (float)age);

        System.out.println();
        System.out.println("-----String class format method-----");
        System.out.println();

        String formattedString = String.format("Your age is %f \n", (float)age);
        System.out.println(formattedString);

        System.out.println();
        System.out.println("-----String class formatted method-----");
        System.out.println();

        formattedString = "Your age is %f \n".formatted((float)age);
        System.out.println(formattedString);

    }
}










































