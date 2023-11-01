public class TernaryOperator {
    public static void main(String[] args) {
        String makeOfCar = "Tata";
        System.out.println("Ternary Operator: Is a opeartor that has 3 operands, the firest is a boolean expression followed by 2 other operand which will be used based on the value of boolean expression"); System.out.println("Syntax: 1stOperand(booleanexpression) ? 2ndoperand : 3rdoperand ");
        System.out.println("If the boolean expression is true then 2nd operand is the result of the statement else if boolean is false then 2rd operand is the result");

        System.out.println("makeofCare Value: " + makeOfCar);
        System.out.println("boolean isDomestic = makeOfCar == \"Tata\" ? true : false;");
        boolean isDomestic = makeOfCar == "Tata" ? true : false;
        System.out.println("isDomestic value: " + isDomestic);
        System.out.println("");
        System.out.println("");

        System.out.println("The values for the 2nd and 3rd operand can be of any valid java type, as long as we are not assigning the result of ternary operator to a variable.");
        System.out.println("makeOfCar == \"Tata\" ? \"Any Value\" : 123");
        System.out.println(makeOfCar == "Tata" ? "Any Value" : 123);
        System.out.println("makeOfCar != \"Tata\" ? \"Any Value\" : 123");
        System.out.println(makeOfCar != "Tata" ? "Any Value" : 123);
        System.out.println("");
        System.out.println("But if we are assigning the result to a variable then both the 2nd and 3rd operand must be of the same type as the variable to which the result is assigned to");
        System.out.println("String result = makeOfCar == \"Tata\" ? \"Any Value\" : 123");
        String res = "";
        // System.out.println( res = makeOfCar == "Tata" ? "Any Value" : 123);
        System.out.println("The error will be: java: incompatible types: bad type in conditional expression\n" +
                "    int cannot be converted to java.lang.String");

    }
}
