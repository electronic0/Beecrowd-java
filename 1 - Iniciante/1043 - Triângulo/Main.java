import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double A, B, C, total;

        A = entrada.nextDouble();
        B = entrada.nextDouble();
        C = entrada.nextDouble();

        if (A < B + C && B < A + C && C < A + B) {
            total = A + B + C;
            System.out.printf("Perimetro = %.1f\n", total);
        } else {
            total = (A + B) * C / 2;
            System.out.printf("Area = %.1f\n", total);
        }

        entrada.close();
    }
}
