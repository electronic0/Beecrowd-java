import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numero, horas;
        double valor, salario;

        numero = entrada.nextInt();
        horas = entrada.nextInt();
        valor = entrada.nextDouble();

        salario = valor * horas;

        System.out.println("NUMBER = " + numero);
        System.out.printf("SALARY = U$ %.2f\n", salario);

        entrada.close();
    }
}