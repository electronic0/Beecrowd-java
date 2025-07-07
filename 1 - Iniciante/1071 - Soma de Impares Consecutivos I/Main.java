import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numeroMinimo, numeroMaximo;
        int resultado = 0;

        numeroMaximo = entrada.nextInt();
        numeroMinimo = entrada.nextInt();

        for (int i = numeroMinimo + 1; i < numeroMaximo; i++) {
            if (i % 2 != 0) {
                resultado += i;
            }
        }

        System.out.println(resultado);

        entrada.close();
    }
}
