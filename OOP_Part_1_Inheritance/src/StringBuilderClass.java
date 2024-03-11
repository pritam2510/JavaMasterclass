import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

public class StringBuilderClass {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("""
                String is immutable that means we can not modify or change a string value in JAVA.
                So when ever are running a manipulation function on a string, a new string is created with the required manipulation and returned to us that's why we always have to assign the result to a new variable in order to access the resultant string
                But StringBuilder creates mutable strings, that means modification on String builder object actually changes the value rather than creating a new string, therefore no need to store it in separate variable. (it returns a reference to itself for method chain call)
                """);
        System.out.println();

        StringBuilder helloWorldBuilder = new StringBuilder("Hello World");
        StringBuilder emptyText = new StringBuilder(5);
        StringBuilder helloText1 = new StringBuilder(helloWorldBuilder);

        String helloWorldString = "Hello World";

        printInformation(helloWorldString);
        printInformation(helloWorldBuilder);

        System.out.println("-----After concat for string and append for builder------");
        helloWorldString.concat(" and goodbye");
        helloWorldBuilder.append(" and goodbye");

        printInformation(helloWorldString);
        printInformation(helloWorldBuilder);

        StringBuilder emptyStart = new StringBuilder();
        StringBuilder emptyStart32 = new StringBuilder(32);

        printInformation(emptyStart);
        printInformation(emptyStart32);

        emptyStart.append("a".repeat(17));
        emptyStart32.append("a".repeat(17));

        printInformation(emptyStart);
        printInformation(emptyStart32);

        System.out.println("------- String Builder methods--------------");
        StringBuilder helloWorldBuilderPlus = new StringBuilder("Hello World");
        helloWorldBuilderPlus.append(" and goodbye");

        System.out.println("------- deletecharat and insert--------------");
        helloWorldBuilderPlus.deleteCharAt(16).insert(16,'g');
        System.out.println(helloWorldBuilderPlus);

        System.out.println("------- replace--------------");
        helloWorldBuilderPlus.replace(16,17,"G");
        System.out.println(helloWorldBuilderPlus);

        System.out.println("------- reverse--------------");
        helloWorldBuilderPlus.reverse();
        System.out.println(helloWorldBuilderPlus);

        System.out.println("------- setlength--------------");
        helloWorldBuilderPlus.setLength(7);
        System.out.println(helloWorldBuilderPlus);

        System.out.println(Timestamp.valueOf(LocalDateTime.now(ZoneOffset.UTC)));
    }

    public static void printInformation(String string){
        System.out.println("String = " + string);
        System.out.println("String length = " + string.length());
    }

    public static void printInformation(StringBuilder string){
        System.out.println("StringBuilder = " + string);
        System.out.println("StringBuilder length = " + string.length());
        System.out.println("StringBuilder capacity = " + string.capacity());
    }
}








































































































