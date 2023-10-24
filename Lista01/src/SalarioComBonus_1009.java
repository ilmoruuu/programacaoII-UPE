import java.util.Locale;
import java.util.Scanner;

public class SalarioComBonus_1009 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        String name = scan.nextLine();
        double salary = scan.nextDouble();
        double sales = scan.nextDouble();
        double rate = ((sales)*(0.15));
        double total = (salary+rate);

        System.out.printf("TOTAL = R$ %.2f\n",total);
        scan.close();
    }
}