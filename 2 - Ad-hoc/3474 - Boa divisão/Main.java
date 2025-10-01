import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double valor, resultado;
        int integrantes;

        valor = entrada.nextDouble();
        integrantes = entrada.nextInt();

        resultado = valor / integrantes;

        System.out.printf("%.2f\n", resultado);

        entrada.close();
    }
}