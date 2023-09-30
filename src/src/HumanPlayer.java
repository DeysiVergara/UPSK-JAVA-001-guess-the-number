import java.util.Scanner;

class HumanPlayer extends Player {
    public HumanPlayer(String name, Integer guesses) {
        super(name, guesses);
    }

    @Override
    public int makeGuess() {
        Scanner scanner = new Scanner(System.in);
        System.out.print(name + ", Ingresa su intento: ");
        return scanner.nextInt();
    }
}