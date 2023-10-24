import java.util.Locale;
import java.util.Scanner;

public class Media1_1005 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double peso1 = 3.5;
        double peso2 = 7.5;
        double media = ((a*peso1) + (b*peso2))/11;

        System.out.printf("MEDIA = %.5f\n",media);
        scan.close();
    }
}