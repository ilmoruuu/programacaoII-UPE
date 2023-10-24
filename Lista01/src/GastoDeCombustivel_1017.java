import java.util.Locale;
import java.util.Scanner;

public class GastoDeCombustivel_1017 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        int hours = scan.nextInt();
        int velocity = scan.nextInt();
        int qntdkms = hours * velocity;
        double qtndliters = (qntdkms / 12.0);

        System.out.printf("%.3f\n",qtndliters);
        scan.close();
    }
}