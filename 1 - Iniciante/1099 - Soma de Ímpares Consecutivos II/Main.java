import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int testes, numeroMinimo, numeroMaximo, numeroTemporario, soma;

        testes = entrada.nextInt();

        for (int i = 0; i < testes; i++) {
            soma = 0;
            numeroMinimo = entrada.nextInt();
            numeroMaximo = entrada.nextInt();
            numeroTemporario = numeroMinimo;

            if (numeroMinimo > numeroMaximo) {
                numeroMinimo = numeroMaximo;
                numeroMaximo = numeroTemporario;
            }

            for (int y = numeroMinimo + 1; y < numeroMaximo; y++) {
                if (y % 2 != 0) {
                    soma += y;
                }
            }

            System.out.println(soma);
        }

        entrada.close();
    }
}
