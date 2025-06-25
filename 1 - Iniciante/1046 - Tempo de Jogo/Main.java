import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int horaInicial, horaFinal, tempo;

        horaInicial = entrada.nextInt();
        horaFinal = entrada.nextInt();

        if (horaInicial > horaFinal || horaInicial == horaFinal) {
            tempo = 24 - (Math.max(horaInicial, horaFinal) - Math.min(horaInicial, horaFinal));
        } else {
            tempo = Math.max(horaInicial, horaFinal) - Math.min(horaInicial, horaFinal);
        }

        System.out.println("O JOGO DUROU " + tempo + " HORA(S)");

        entrada.close();
    }
}
