abstract class Player {
    protected String name;
    protected Integer guesses;
    public static int computerGuesses = 0;
    public static int HumanGuesses= 0;
    public Player(String name, Integer guesses) {
        this.name = name;
        this.guesses = guesses;
    }

    public abstract int makeGuess();
}
