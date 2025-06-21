import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int distancia, tempo;

        distancia = entrada.nextInt();

        tempo = distancia * 2;

        System.out.println(tempo + " minutos");

        entrada.close();
    }
}