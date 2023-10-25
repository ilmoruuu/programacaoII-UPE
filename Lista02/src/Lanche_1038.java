import java.util.Locale;
import java.util.Scanner;

public class Lanche_1038 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        int code = scan.nextInt();
        int qntd = scan.nextInt();
        double valor = 0;

        if (code == 1) {
            valor = 4.00;
        } else if (code == 2) {
            valor = 4.50;
        } else if (code == 3) {
            valor = 5.00;
        } else if (code == 4) {
            valor = 2.00;
        } else if (code == 5) {
            valor = 1.50;
        }

        double total = (valor*qntd);

        System.out.printf("Total: R$ %.2f\n",total);
        scan.close();
    }
}
