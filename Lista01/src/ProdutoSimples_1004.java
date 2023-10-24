import java.util.Locale;
import java.util.Scanner;

public class ProdutoSimples_1004 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();
        int prod = (a*b);

        System.out.println("PROD = "+prod);
        scan.close();
    }
}
