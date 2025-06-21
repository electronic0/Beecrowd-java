import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int distancia;
        double gasto, media;

        distancia = entrada.nextInt();
        gasto = entrada.nextDouble();

        media = distancia / gasto;

        System.out.printf("%.3f km/l\n", media);

        entrada.close();
    }
}