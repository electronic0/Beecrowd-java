import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double A, B, C, delta, x1, x2;

        A = entrada.nextDouble();
        B = entrada.nextDouble();
        C = entrada.nextDouble();

        delta = Math.pow(B, 2) - 4 * A * C;

        x1 = (-B + Math.sqrt(delta)) / (2 * A);
        x2 = (-B - Math.sqrt(delta)) / (2 * A);

        if (Double.isNaN(x1) || Double.isNaN(x2)) {
            System.out.println("Impossivel calcular");
        } else {
            System.out.printf("R1 = %.5f\n", x1);
            System.out.printf("R2 = %.5f\n", x2);
        }

        entrada.close();
    }
}
