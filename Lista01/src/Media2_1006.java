import java.util.Locale;
import java.util.Scanner;

public class Media2_1006 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double c = scan.nextDouble();
        double peso_a = 2;
        double peso_b = 3;
        double peso_c = 5;
        double media = ((a*peso_a) + (b*peso_b) + (c*peso_c))/10;

        System.out.printf("MEDIA = %.1f\n",media);
        scan.close();
    }
}
