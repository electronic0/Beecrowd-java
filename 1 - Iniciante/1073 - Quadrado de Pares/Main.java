import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numero;

        numero = entrada.nextInt();

        for (int i = 1; i <= numero; i++) {
            if (i % 2 == 0) {
                System.out.printf("%d^2 = %d\n", i, i * i);
            }
        }

        entrada.close();
    }
}
