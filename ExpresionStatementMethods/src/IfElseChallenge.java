public class IfElseChallenge {
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800,
                leveCompleted = 5,
                bonus = 100;
        int finalScore = score;

        if (gameOver) {
            finalScore += (leveCompleted * bonus);
            System.out.println("Your final score was : " + finalScore);
        }

        score = 10000;
        leveCompleted = 8;
        bonus = 200;
        finalScore = score;

        if (gameOver) {
            finalScore += (leveCompleted * bonus);
            System.out.println("Your final score was : " + finalScore);
        }

    }
}
