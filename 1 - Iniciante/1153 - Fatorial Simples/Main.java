import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numero;
        int resultado = 1;

        numero = entrada.nextInt();

        for (int i = numero; i >= 1; i--) {
            resultado *= i;
        }

        System.out.println(resultado);

        entrada.close();
    }
}