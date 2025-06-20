import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numero1, numero2, numero3, numero4, diferenca;

        numero1 = entrada.nextInt();
        numero2 = entrada.nextInt();
        numero3 = entrada.nextInt();
        numero4 = entrada.nextInt();

        diferenca = numero1 * numero2 - numero3 * numero4;

        System.out.println("DIFERENCA = " + diferenca);

        entrada.close();
    }
}