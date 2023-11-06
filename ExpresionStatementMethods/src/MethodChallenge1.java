public class MethodChallenge1 {
    public static void main(String[] args) {
        displayHighScorePosition("Pritam", calculateHighScorePosition(1500));
        displayHighScorePosition("Pritam", calculateHighScorePosition(1000));
        displayHighScorePosition("Pritam", calculateHighScorePosition(500));
        displayHighScorePosition("Pritam", calculateHighScorePosition(100));
        displayHighScorePosition("Pritam", calculateHighScorePosition(25));
    }

    public static void displayHighScorePosition(String playerName, int playerPosition) {
        System.out.println(
                playerName
                        + " managed to get into position "
                        + playerPosition
                        + " on the high score list"
        );
    }

    public static int calculateHighScorePosition(int playerScore) {
        if (playerScore >= 1000) {
            return 1;
        } else if (playerScore >= 500) {
            return 2;
        } else if (playerScore >= 100) {
            return 3;
        }
        return 4;

//        if (playerScore >= 1000) {
//            return 1;
//        } else if (playerScore >= 500 && playerScore < 1000) {
//            return 2;
//        } else if (playerScore >= 100 && playerScore < 500) {
//            return 3;
//        }
//        return 4;
    }
}
