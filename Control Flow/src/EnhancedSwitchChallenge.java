public class EnhancedSwitchChallenge {
    public static void main(String[] args) {
        char charValue = 'D';
        String result = switch (charValue) {
            case 'A' -> "A is Able";
            case 'B' -> "B is BAKER";
            case 'C' -> "C is CHARLIE";
            case 'D' -> "D is DOG";
            case 'E' -> "E is EASY";
            default -> "Letter '" + charValue + "' not found !!";
        };

        System.out.println(result);
        printDayOfWeek(1);
        printDayOfWeek(2);
        printDayOfWeek(4);
        printDayOfWeek(9);
        getPhoeneticMessage("PRITAM");
    }

    public  static  void printDayOfWeek(int day){
        String result  = switch(day){
            case 0 -> "Sunday";
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            default -> "Invalid day";
        };

        System.out.println(day + " => " + result);
    }

    public static void getPhoeneticMessage(String message) {
        for (int i = 0; i < message.length(); i++) {
            System.out.print(getPhoeneticAlphabet(message.toLowerCase().charAt(i)).toUpperCase() + " ");
        }
    }

    public static String getPhoeneticAlphabet(char letter) {
       return switch (letter) {
            case 'a' -> {
                yield "alpha";
            }
            case 'b' -> {
                yield "bravo";
            }
            case 'c' -> {
                yield "charlie";
            }
            case 'd' -> {
                yield "delta";
            }
            case 'e' -> {
                yield "echo";
            }
            case 'f' -> {
                yield "foxtrot";
            }
            case 'g' -> {
                yield "golf";
            }
            case 'h' -> {
                yield "hotel";
            }
            case 'i' -> {
                yield "india";
            }
            case 'j' -> {
                yield "juliet";
            }
            case 'k' -> {
                yield "kilo";
            }
            case 'l' -> {
                yield "lima";
            }
            case 'm' -> {
                yield "mike";
            }
            case 'n' -> {
                yield "november";
            }
            case 'o' -> {
                yield "october";
            }
            case 'p' -> {
                yield "papa";
            }
            case 'q' -> {
                yield "quebec";
            }
            case 'r' -> {
                yield "romeo";
            }
            case 's' -> {
                yield "sierra";
            }
            case 't' -> {
                yield "tango";
            }
            case 'u' -> {
                yield "uniform";
            }
            case 'v' -> {
                yield "victor";
            }
            case 'w' -> {
                yield "whiskey";
            }
            case 'x' -> {
                yield "xray";
            }
            case 'y' -> {
                yield "yankee";
            }
            case 'z' -> {
                yield "zulu";
            }
            case ' ' -> {
                yield " ";
            }
            default -> {
                yield "not in list";
            }
        };
    }
}
