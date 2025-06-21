import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double numero1, numero2, numero3;
        double pi = 3.14159;

        numero1 = entrada.nextDouble();
        numero2 = entrada.nextDouble();
        numero3 = entrada.nextDouble();

        System.out.printf("TRIANGULO: %.3f\n", numero1 * numero3 / 2);
        System.out.printf("CIRCULO: %.3f\n", pi * numero3 * numero3);
        System.out.printf("TRAPEZIO: %.3f\n", (numero1 + numero2) * numero3 / 2);
        System.out.printf("QUADRADO: %.3f\n", numero2 * numero2);
        System.out.printf("RETANGULO: %.3f\n", numero1 * numero2);

        entrada.close();
    }
}