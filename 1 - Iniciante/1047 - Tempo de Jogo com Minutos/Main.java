import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int minutoInicial, minutoFinal, horaInicial, horaFinal, tempoInicial, tempoFinal, horas, minutos;

        horaInicial = entrada.nextInt();
        minutoInicial = entrada.nextInt();

        horaFinal = entrada.nextInt();
        minutoFinal = entrada.nextInt();

        tempoInicial = horaInicial * 60 + minutoInicial;
        tempoFinal = horaFinal * 60 + minutoFinal;

        if (tempoFinal <= tempoInicial) {
            tempoFinal += 24 * 60;
        }

        horas = (tempoFinal - tempoInicial) / 60;
        minutos = (tempoFinal - tempoInicial) % 60;

        System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n", horas, minutos);

        entrada.close();
    }
}
