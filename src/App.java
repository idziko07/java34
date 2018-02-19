import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);
        Directions[] directions = Directions.values();
        int i =0;
        System.out.println("Kierunki geograficzne: ");
        for (Directions direction : directions) {
            System.out.println(i + " - " + direction.name());
            i++;
        }

        System.out.println("\nW jakim kierunku idziemy: ");
        int go = input.nextInt();

        System.out.println(Directions.convert(go));

        }
}
