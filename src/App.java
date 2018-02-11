import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);
        Directions[] directions = Directions.values();

        System.out.println("Kierunki geograficzne: ");
        for (Directions direction : directions) {
            System.out.println(direction.name());
        }

        System.out.println("\nW jakim kierunku idziemy: ");
        String go = input.nextLine();

        System.out.println(Directions.valueOf(go));
    }
}
