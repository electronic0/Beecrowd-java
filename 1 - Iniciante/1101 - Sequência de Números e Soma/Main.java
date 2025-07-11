import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int minimo, maximo, minimoTemporario, maximoTemporario, soma;

        while (true) {
            soma = 0;
            maximo = entrada.nextInt();
            minimo = entrada.nextInt();
            minimoTemporario = minimo;
            maximoTemporario = maximo;

            if (minimo <= 0 || maximo <= 0) {
                break;
            }

            if (minimo > maximo) {
                minimo = maximoTemporario;
                maximo = minimoTemporario;
            }

            for (int i = minimo; i < maximo + 1; i++) {
                System.out.printf("%d ", i);
                soma += i;
            }

            System.out.println("Sum=" + soma);
        }

        entrada.close();
    }
}
