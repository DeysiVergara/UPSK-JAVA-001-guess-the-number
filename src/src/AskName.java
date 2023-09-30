import java.util.Scanner;

public class AskName {
    public void AskAndShowName() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Cual es tu nombre: ");
        String name = scanner.nextLine();
        System.out.println("\n Bienvenid@, " + name + ", comencemos a jugar, adivina el número!");
    }
}
