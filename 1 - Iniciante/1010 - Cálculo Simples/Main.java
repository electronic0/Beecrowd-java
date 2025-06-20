import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int codigo1, codigo2, quantidade1, quantidade2;
        double valor1, valor2, total;

        codigo1 = entrada.nextInt();
        quantidade1 = entrada.nextInt();
        valor1 = entrada.nextDouble();

        codigo2 = entrada.nextInt();
        quantidade2 = entrada.nextInt();
        valor2 = entrada.nextDouble();

        total = quantidade1 * valor1 + quantidade2 * valor2;

        System.out.printf("VALOR A PAGAR: R$ %.2f\n", total);

        entrada.close();
    }
}