import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numero1, numero2, resultado;

        numero1 = entrada.nextInt();
        numero2 = entrada.nextInt();

        resultado = numero1 * numero2;

        System.out.println("PROD = " + resultado);

        entrada.close();
    }
}
