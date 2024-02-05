import java.util.Random;
import java.util.Scanner;

public class losowanie {
    public static void main(String[] args) {

        Random random = new Random();
        int numberToGuess = random.nextInt(100) + 1;

        boolean wasNumberGuess = false;
        Scanner scanner = new Scanner(System.in);
        while (!wasNumberGuess) {
            System.out.println("Zgadnij liczbę: ");
            int UserNumber = scanner.nextInt();

            if (UserNumber == numberToGuess) {
                System.out.println("Zgadłeś!");
                break;
            } else if (UserNumber > numberToGuess) {
                System.out.println("Liczba jest zbyt duża");
            } else if (UserNumber < numberToGuess) {
                System.out.println("Liczba jest zbyt mała");
            } else {
                System.out.println("Nie zgadłeś");
            }

        }
    }
}
