import java.util.Locale;
import java.util.Scanner;

public class Salario_1008 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();
        int hours = scan.nextInt();
        double rate = scan.nextDouble();
        double salary = (hours*rate);

        System.out.println("NUMBER = "+num);
        System.out.printf("SALARY = U$ %.2f\n",salary);
        scan.close();
    }
}