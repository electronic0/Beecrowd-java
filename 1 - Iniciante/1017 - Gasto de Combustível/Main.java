import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int tempo;
        double velocidade, combustivel;

        tempo = entrada.nextInt();
        velocidade = entrada.nextDouble();

        combustivel = tempo * velocidade / 12;

        System.out.printf("%.3f\n", combustivel);

        entrada.close();
    }
}