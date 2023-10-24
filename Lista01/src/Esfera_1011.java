import java.util.Locale;
import java.util.Scanner;

public class Esfera_1011 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        int raio = scan.nextInt();
        double pi = 3.14159;
        double volume = ((4.0/3) * pi * Math.pow(raio,3));

        System.out.printf("VOLUME = %.3f\n",volume);
        scan.close();
    }
}