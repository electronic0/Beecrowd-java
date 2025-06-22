import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int tempo, horas, minutos;

        tempo = entrada.nextInt();

        horas = tempo / 3600;
        tempo -= horas * 3600;

        minutos = tempo / 60;
        tempo -= minutos * 60;

        System.out.printf("%d:%d:%d\n", horas, minutos, tempo);

        entrada.close();
    }
}