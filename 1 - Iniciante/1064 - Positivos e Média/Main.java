import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double numero;
        double media = 0;
        int positivos = 0;

        for (int i = 0; i < 6; i++) {
            numero = entrada.nextDouble();

            if (numero > 0) {
                positivos++;
                media += numero;
            }
        }

        media /= positivos;

        System.out.println(positivos + " valores positivos");
        System.out.printf("%.1f\n", media);

        entrada.close();
    }
}
