public class StringMethods {
    public static void main(String[] args) {
        String text = "Hello World";

        System.out.println("String text = " + text);

        System.out.println("==============STRING INSPECTION===================");
        System.out.println("----------String.length()-------------");
        System.out.println("string length = " + text.length());

        System.out.println("----------String.charAt()-------------");
        System.out.println("charAt(0) = " + text.charAt(0));
        System.out.println("charAt(text.length() -1) = " + text.charAt(text.length() - 1));

        System.out.println("----------String.indexOf()-------------");
        System.out.println("indexOf(\"o\") = " + text.indexOf("o"));
        System.out.println("indexOf(\"Wor\") = " + text.indexOf("Wor"));
        System.out.println("indexOf(\"l\") = " + text.indexOf("l"));
        System.out.println("indexOf(\"l\", 3) = " + text.indexOf("l", 3));

        System.out.println("----------String.lastIndexOf()-------------");
        System.out.println("lastIndexOf(\"o\") = " + text.lastIndexOf("o"));
        System.out.println("lastIndexOf(\"l\") = " + text.lastIndexOf("l"));
        System.out.println("lastIndexOf(\"l\", 8) = " + text.lastIndexOf("l", 8));

        System.out.println("----------String.isEmpty()-------------");
        System.out.println("text.isEmpty() = " + text.isEmpty());
        System.out.println("\"\".isEmpty() = " + "".isEmpty());
        System.out.println("\"   \".isEmpty() = " + "   ".isEmpty());

        System.out.println("----------String.isBlank()-------------");
        System.out.println("text.isBlank() = " + text.isBlank());
        System.out.println("\"   \".isBlank() = " + "   ".isBlank());
        System.out.println("\"   \".length() = " + "   ".length());
        System.out.println("\"   \".charAt() = " + "   ".charAt(0));

        text = "Hello World";
        String text1 = "Hello World";
        String text2 = "hello world";

        System.out.println("String text = " + text);
        System.out.println("String text1 = " + text1);
        System.out.println("String text2 = " + text2);

        System.out.println("==============STRING COMPARISON===================");
        System.out.println("----------String.equals()-------------");
        System.out.println("equals(\"Hello World\") = " + text.equals("Hello World"));
        System.out.println("equals(\"hello world\") = " + text.equals("hello world"));
        System.out.println("equals(text1) = " + text.equals(text1));

        System.out.println("----------String.contentEquals()-------------");
        System.out.println("contentEquals(\"Hello World\") = " + text.contentEquals("Hello World"));
        System.out.println("contentEquals(\"hello world\") = " + text.contentEquals("hello world"));
        System.out.println("contentEquals(text1) = " + text.contentEquals(text1));

        System.out.println("----------String.contentEquals()-------------");
        System.out.println("equalsIgnoreCase(\"Hello World\") = " + text.equalsIgnoreCase("Hello World"));
        System.out.println("equalsIgnoreCase(text2) = " + text.equalsIgnoreCase(text2));

        System.out.println("----------String.contains()-------------");
        System.out.println("contains(\"Hello\") = " + text.contains("Hello"));
        System.out.println("contains(\"hello\") = " + text.contains("hello"));

        System.out.println("----------String.startsWith()-------------");
        System.out.println("startsWith(\"Hello\") = " + text.startsWith("Hello"));
        System.out.println("startsWith(\"hello\") = " + text.startsWith("hello"));
        System.out.println("startsWith(\"ello\") = " + text.startsWith("ello", 1));

        System.out.println("----------String.endsWith()-------------");
        System.out.println("endsWith(\"World\") = " + text.endsWith("World"));
        System.out.println("endsWith(\"world\") = " + text.endsWith("world"));


        text1 = "25/10/1995";

        System.out.println("String text1(DOB) = " + text1);

        System.out.println();
        System.out.println("==============STRING MANIPULATION===================");
        System.out.println("--------------substring()---------------");
        System.out.println("Birth year using substring on the DOB " + text1 + " = " + text1.substring(text1.indexOf("1995")));
        System.out.println("Birth month using substring on the DOB " + text1 + " = " + text1.substring(text1.indexOf("10"), text1.indexOf("10") + 2));

        System.out.println("--------------join()---------------");
        String newDate = String.join("/", "25", "10", "1995");
        System.out.println("DOB created using String.join = " + newDate);

        System.out.println("--------------concat()---------------");
        newDate = "25";
        newDate = newDate.concat("/");
        newDate = newDate.concat("10");
        newDate = newDate.concat("/");
        newDate = newDate.concat("1995");
        System.out.println("DOB created using String.concat = " + newDate);

        System.out.println("--------------concat() as + symbol---------------");
        newDate = "25" + "/" + "10" + "/" + "1995";
        System.out.println("DOB created using String.concat = " + newDate);

        System.out.println("--------------concat() on string literal directly---------------");
        newDate = "25".concat("/").concat("10").concat("/").concat("1995");
        System.out.println("DOB created using String.concat = " + newDate);

        System.out.println("--------------replace()---------------");
        System.out.println("Replace / with - in DOB using String.replace " + newDate.replace('/', '-'));
        System.out.println("Replace 2 with \"two\" in DOB using String.replace " + newDate.replace("2", "Two"));

        System.out.println("--------------replaceFirst()---------------");
        System.out.println("Replace first / with - in DOB using String.replace " + newDate.replaceFirst("/", "-"));
        System.out.println("replace can also work with regex");

        System.out.println("--------------replaceAll()---------------");
        System.out.println("Replace all / with --- in DOB using String.replace " + newDate.replaceAll("/", "---"));
        System.out.println("replaceAll has the ability to work with regex for text to be replaced whereas replace can only use string otherwise both are similar in function");

        System.out.println("--------------repeat()---------------");
        System.out.println("ABC ".repeat(5));
        System.out.println("ABC \n".repeat(4));

        System.out.println("--------------indent()---------------");
        System.out.println("using indent to add spaces in front of the text \"ABC\" = " + "ABC".indent(5));
        System.out.println("using indent with negative value to remove spaces from front of the text \"   ABC\" = " + "ABC".indent(-3));

        System.out.println("--------------trim()---------------");
        System.out.println("using trim to remove single spaces from both end of the text \"   ABC     \" = '" + "          ABC        ".trim()+"'");



        String str = "        Geeks For Geeks Internship    !   ";
        System.out.println("str = '" + str+"'");

        System.out.println("--------------strip()---------------");
        System.out.println("str.strip() = '" + str.strip() + "'");

        System.out.println("--------------stripLeading()---------------");
        System.out.println(" str.stripLeading() = '" + str.stripLeading() + "'");

        System.out.println("--------------stripTrailing()---------------");
        System.out.println("str.stripTrailing() = '" + str.stripTrailing() + "'");
    }
}



















































































































