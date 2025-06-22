import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int [] notas = {100, 50, 20, 10, 5, 2, 1};
        int valor, valorLido;

        valor = entrada.nextInt();
        valorLido = valor;

        System.out.println(valorLido);

        for (int nota: notas) {
            System.out.printf("%d nota(s) de R$ %d,00\n", valor / nota, nota);
            valor %= nota;
        }

        entrada.close();
    }
}
