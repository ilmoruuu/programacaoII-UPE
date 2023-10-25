import java.util.Locale;
import java.util.Scanner;

public class TempoDeJogoComMinutos_1047 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        int horaInicial = scan.nextInt();
        int minInicial = scan.nextInt();
        int horaFinal = scan.nextInt();
        int minFinal = scan.nextInt();

        int hrPminI = ((horaInicial * 60) + minInicial);
        int hrPminF = ((horaFinal * 60) + minFinal);
        int hrPdia = (24 * 60);
        int total;

        if (hrPminF > hrPminI) {
            total = (hrPminF - hrPminI);
            System.out.println("O JOGO DUROU " + (total / 60) + " HORA(S) E " + (total % 60) + " MINUTO(S)");


        } else if (hrPminF < hrPminI) {
            total = (hrPdia - hrPminI) + hrPminF;
            System.out.println("O JOGO DUROU " + (total / 60) + " HORA(S) E " + (total % 60) + " MINUTO(S)");

        } else {
            System.out.println("O JOGO DUROU 24 HORA(S) E 0 MINUTO(S)");
        }
        scan.close();
    }
}