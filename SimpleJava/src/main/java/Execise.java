import java.util.Scanner;

public class Execise {
    public static void main (String[] args) {
       /* System.out.println("Podaj swój wiek: ");

        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        int i = scanner.nextInt();

        for (i = 0; i <= 23; i++) {
            System.out.println(i);
        }

        int j = 0;

        while (j <= 23) {
            System.out.println(j);
            j++;
        }
*/
        int j = 0;
        do {
            System.out.println("Kiedy mam się skończyć? " + j);
            j++;
        } while (j <= 5);
}
}
