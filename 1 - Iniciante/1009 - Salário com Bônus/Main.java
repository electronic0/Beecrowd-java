import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String nome;
        double salario, vendas, total;

        nome = entrada.nextLine();
        salario = entrada.nextDouble();
        vendas = entrada.nextDouble();

        total = salario + (vendas * 0.15);

        System.out.printf("TOTAL = R$ %.2f\n", total);

        entrada.close();
    }
}