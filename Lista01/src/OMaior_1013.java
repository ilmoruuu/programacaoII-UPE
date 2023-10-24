import java.util.Locale;
import java.util.Scanner;

public class OMaior_1013 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        int maiorab = (a + b + Math.abs(a - b)) / 2;
        int maiorabc = (maiorab + c + Math.abs(maiorab - c)) /2;

        System.out.println(maiorabc+" eh o maior");
        scan.close();
    }
}