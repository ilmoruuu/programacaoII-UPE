import java.util.Locale;
import java.util.Scanner;

public class Diferenca_1007 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan  = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int d = scan.nextInt();
        int dif = ((a * b) - (c*d));

        System.out.println("DIFERENCA = "+dif);
        scan.close();
    }
}
