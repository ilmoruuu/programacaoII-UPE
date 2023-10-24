import java.util.Locale;
import java.util.Scanner;

public class SomaSimples_1003 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();
        int soma = (a+b);

        System.out.println("SOMA = "+soma);
        scan.close();
    }
}
