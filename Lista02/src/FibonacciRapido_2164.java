import java.util.Locale;
import java.util.Scanner;

public class FibonacciRapido_2164 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        double fibronacci = ((Math.pow(((1+(Math.sqrt(5)))/2),n) - Math.pow(((1-(Math.sqrt(5)))/2),n))/Math.sqrt(5));

        System.out.printf("%.1f\n",fibronacci);

        scan.close();
    }
}