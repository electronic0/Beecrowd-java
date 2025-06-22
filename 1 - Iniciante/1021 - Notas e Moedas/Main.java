import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double [] notas = {10000, 5000, 2000, 1000, 500, 200};
        double [] moedas = {100, 50, 25, 10, 5, 1};
        double valor;

        valor = entrada.nextDouble();
        valor *= 100;

        System.out.println("NOTAS:");
        for (double nota: notas) {
            System.out.printf("%.0f nota(s) de R$ %.2f\n", Math.floor(valor / nota), nota / 100);
            valor %= nota;
        }

        System.out.println("MOEDAS:");
        for (double moeda: moedas) {
            System.out.printf("%.0f moeda(s) de R$ %.2f\n", Math.floor(valor / moeda), moeda / 100);
            valor %= moeda;
        }

        entrada.close();
    }
}
