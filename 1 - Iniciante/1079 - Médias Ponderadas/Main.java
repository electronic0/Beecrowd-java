import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double valor1, valor2, valor3, media;
        int testes;
        
        testes = entrada.nextInt();

        for (int i = 0; i < testes; i++) {
            media = 0;

            valor1 = entrada.nextDouble();
            valor2 = entrada.nextDouble();
            valor3 = entrada.nextDouble();

            media = (valor1 * 2 + valor2 * 3 + valor3 * 5) / 10;

            System.out.printf("%.1f\n", media);
        }

        entrada.close();
    }
}
