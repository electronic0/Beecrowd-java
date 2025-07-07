import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String diaInicial [] = entrada.nextLine().split(" ");
        String horaInicial [] = entrada.nextLine().replaceAll(" ", "").split(":");
        String diaFinal [] = entrada.nextLine().split(" ");
        String horaFinal [] = entrada.nextLine().replaceAll(" ", "").split(":");

        int dia1 = Integer.parseInt(diaInicial[1]);
        int hora1 = Integer.parseInt(horaInicial[0]);
        int minuto1 = Integer.parseInt(horaInicial[1]);
        int segundo1 = Integer.parseInt(horaInicial[2]);

        int dia2 = Integer.parseInt(diaFinal[1]);
        int hora2 = Integer.parseInt(horaFinal[0]);
        int minuto2 = Integer.parseInt(horaFinal[1]);
        int segundo2 = Integer.parseInt(horaFinal[2]);

        int quantidade1 = segundo1 + minuto1 * 60 + hora1 * 3600 + dia1 * 86400;
        int quantidade2 = segundo2 + minuto2 * 60 + hora2 * 3600 + dia2 * 86400;
        int tempo = quantidade2 - quantidade1;

        System.out.printf("%d dia(s)\n", tempo / 86400);

        tempo %= 86400;

        System.out.printf("%d hora(s)\n", tempo / 3600);

        tempo %= 3600;

        System.out.printf("%d minuto(s)\n", tempo / 60);

        tempo %= 60;

        System.out.printf("%d segundo(s)\n", tempo);

        entrada.close();
    }
}
