import java.util.Random;

public class GuessTheNumberGame {
    public static final Random RANDOM = new Random();
    public static final int RANDOM_NUMBER = RANDOM.nextInt(100) + 1;

    public static void main(String[] args) {
        int humanGuesses = 1;
        int computerGuesses = 1;
        AskName AskName = new AskName();
        AskName.AskAndShowName();
        Player player1 = new HumanPlayer(" Jugador 1", humanGuesses);
        Player player2 = new ComputerPlayer("Máquina", computerGuesses);

        boolean gameOver = false;
        int guessNumber;


        while (!gameOver) {
            System.out.println("\nRonda: " + player1.name);
            guessNumber = player1.makeGuess();
            gameOver = checkGuess(guessNumber, player1);
            humanGuesses++;
            player1.guesses = humanGuesses;

            if (!gameOver) {
                ((ComputerPlayer) player2).updateLastHumanGuess(guessNumber);

                System.out.println("\nRonda: " + player2.name);
                guessNumber = player2.makeGuess();
                gameOver = checkGuess(guessNumber, player2);
                computerGuesses++;
                player2.guesses = computerGuesses;
            }
        }
    }

    public static boolean checkGuess(int guess, Player player) {
        if (guess < RANDOM_NUMBER) {
            System.out.println("Muy bajo!");
        } else if (guess > RANDOM_NUMBER) {
            System.out.println("Muy alto!");
        } else {
            System.out.println("Felicitaciones, " + player.name + ", adivinaste el numero en " + player.guesses + " intentos.");
            return true;
        }
        return false;
    }
}