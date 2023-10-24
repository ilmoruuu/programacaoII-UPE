import java.util.Locale;
import java.util.Scanner;

public class Distancia_1016 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        int x = scan.nextInt();
        int min = x*2;

        System.out.println(min+" minutos");
        scan.close();
    }
}
