import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double x1, x2, y1, y2, distancia;

        x1 = entrada.nextDouble();
        y1 = entrada.nextDouble();
        x2 = entrada.nextDouble();
        y2 = entrada.nextDouble();

        distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        System.out.printf("%.4f\n", distancia);

        entrada.close();
    }
}