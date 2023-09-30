import java.util.Random;

class ComputerPlayer extends Player {
    public static final Random RANDOM = new Random();
    private int lastHumanGuess;

    public ComputerPlayer(String name, Integer guesses) {
        super(name, guesses);
    }

    public void updateLastHumanGuess(int lastHumanGuess) {
        this.lastHumanGuess = lastHumanGuess;
    }

    @Override
    public int makeGuess() {
        int machineGuess;

        if (lastHumanGuess < GuessTheNumberGame.RANDOM_NUMBER) {
            machineGuess = lastHumanGuess + RANDOM.nextInt(10) + 1;
        } else {
            machineGuess = lastHumanGuess - RANDOM.nextInt(10) - 1;
        }

        machineGuess = Math.max(1, Math.min(100, machineGuess));

        System.out.println("Intento Máquina: " + machineGuess);
        return machineGuess;
    }
}