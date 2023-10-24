import java.util.Locale;
import java.util.Scanner;

public class CalculoSimples_1010 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        int cod1 = scan.nextInt();
        int qntd1 = scan.nextInt();
        double price1 = scan.nextDouble();
        int cod2 = scan.nextInt();
        int qntd2 = scan.nextInt();
        double price2 = scan.nextDouble();
        double total = (qntd1 * price1) + (qntd2 * price2);

        System.out.printf("VALOR A PAGAR: R$ %.2f\n",total);
        scan.close();
    }
}