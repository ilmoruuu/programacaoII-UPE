import java.util.Locale;
import java.util.Scanner;

public class SortSimples_1042 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        int ordem1 = Math.min(a,Math.min(b,c));
        int ordem2 = 0;
        int ordem3 = 0;

        if (ordem1 == a){
            ordem2 = Math.min(b,c);
            ordem3 = Math.max(b,c);
        }

        if (ordem1 == b){
            ordem2 = Math.min(a,c);
            ordem3 = Math.max(a,c);
        }

        if (ordem1 == c){
            ordem2 = Math.min(a,b);
            ordem3 = Math.max(a,b);
        }

        System.out.println(ordem1);
        System.out.println(ordem2);
        System.out.println(ordem3);
        System.out.println("");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        scan.close();
    }
}