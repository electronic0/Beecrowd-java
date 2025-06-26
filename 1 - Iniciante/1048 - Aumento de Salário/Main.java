import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double salario, reajusteGanho, total; 
        double reajuste = 0;

        salario = entrada.nextDouble();

        if (salario >= 0 && salario <= 400) {
            reajuste = 0.15;
        } else if (salario >= 400.01 && salario <= 800) {
            reajuste = 0.12;
        } else if (salario >= 800.01 && salario <= 1200) {
            reajuste = 0.10;
        } else if (salario >= 1200.01 && salario <= 2000) {
            reajuste = 0.07;
        } else {
            reajuste = 0.04;
        }

        reajusteGanho = salario * reajuste;
        total = salario + reajusteGanho;

        System.out.printf("Novo salario: %.2f\n", total);
        System.out.printf("Reajuste ganho: %.2f\n", reajusteGanho);
        System.out.printf("Em percentual: %.0f %%\n", reajuste * 100);

        entrada.close();
    }
}
