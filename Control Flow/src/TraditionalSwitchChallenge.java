public class TraditionalSwitchChallenge {
    public static void main(String[] args) {
        char charValue = 'D';
        switch (charValue) {
            case 'A':
                System.out.println("A is Able");
                break;
            case 'B':
                System.out.println("B is BAKER");
                break;
            case 'C':
                System.out.println("C is CHARLIE");
                break;
            case 'D':
                System.out.println("D is DOG");
                break;
            case 'E':
                System.out.println("E is EASY");
                break;
            default:
                System.out.println("Letter '" + charValue + "' not found !!");
        }

        getPhoeneticMessage("PRITAM");
    }

    public static void getPhoeneticMessage(String message) {
        for (int i = 0; i < message.length(); i++) {
            System.out.print(getPhoeneticAlphabet(message.toLowerCase().charAt(i)).toUpperCase() + " ");
        }
    }

    public static String getPhoeneticAlphabet(char letter) {
        switch (letter) {
            case 'a' -> {
                return "alpha";
            }
            case 'b' -> {
                return "bravo";
            }
            case 'c' -> {
                return "charlie";
            }
            case 'd' -> {
                return "delta";
            }
            case 'e' -> {
                return "echo";
            }
            case 'f' -> {
                return "foxtrot";
            }
            case 'g' -> {
                return "golf";
            }
            case 'h' -> {
                return "hotel";
            }
            case 'i' -> {
                return "india";
            }
            case 'j' -> {
                return "juliet";
            }
            case 'k' -> {
                return "kilo";
            }
            case 'l' -> {
                return "lima";
            }
            case 'm' -> {
                return "mike";
            }
            case 'n' -> {
                return "november";
            }
            case 'o' -> {
                return "october";
            }
            case 'p' -> {
                return "papa";
            }
            case 'q' -> {
                return "quebec";
            }
            case 'r' -> {
                return "romeo";
            }
            case 's' -> {
                return "sierra";
            }
            case 't' -> {
                return "tango";
            }
            case 'u' -> {
                return "uniform";
            }
            case 'v' -> {
                return "victor";
            }
            case 'w' -> {
                return "whiskey";
            }
            case 'x' -> {
                return "xray";
            }
            case 'y' -> {
                return "yankee";
            }
            case 'z' -> {
                return "zulu";
            }
            case ' ' -> {
                return " ";
            }
            default -> {
                return "not in list";
            }
        }
    }
}

