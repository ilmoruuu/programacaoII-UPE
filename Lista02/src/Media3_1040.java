import java.util.Locale;
import java.util.Scanner;

public class Media3_1040 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        double n1 = scan.nextDouble();
        double n2 = scan.nextDouble();
        double n3 = scan.nextDouble();
        double n4 = scan.nextDouble();

        double p1 = 2, p2 = 3, p3 = 4, p4 = 1;

        double media = ((n1*p1)+(n2*p2)+(n3*p3)+(n4*p4))/10;
        double mediaarredondada = (Math.floor(media*10)/10);

        System.out.printf("Media: %.1f\n",mediaarredondada);
        if (mediaarredondada >= 7.0){
            System.out.println("Aluno aprovado.");

        } else if (mediaarredondada < 5.0){
            System.out.println("Aluno reprovado.");

        } else if (media >= 5.0 && media <=6.9){
            System.out.println("Aluno em exame.");
            double nfinal = scan.nextDouble();

            System.out.printf("Nota do exame: %.1f\n",nfinal);
            double mediafinal = (media+nfinal)/2;

            if (mediafinal >= 5.0){
                System.out.println("Aluno aprovado.");

            } else {
              System.out.println("Aluno reprovado.");
            }

            System.out.printf("Media final: %.1f\n",mediafinal);
        }
        scan.close();
    }
}