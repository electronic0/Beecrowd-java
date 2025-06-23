import java.util.Scanner;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        HashMap<Integer, Double> tabela = new HashMap<>();

        tabela.put(1, 4.0);
        tabela.put(2, 4.50);
        tabela.put(3, 5.0);
        tabela.put(4, 2.0);
        tabela.put(5, 1.5);

        int codigo, quantidade;
        double total;

        codigo = entrada.nextInt();
        quantidade = entrada.nextInt();

        total = tabela.get(codigo) * quantidade;

        System.out.printf("Total: R$ %.2f\n", total);

        entrada.close();
    }
}
