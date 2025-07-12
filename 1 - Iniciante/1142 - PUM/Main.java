import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int linhas;
        int numero1 = 1;
        int numero2 = 2;
        int numero3 = 3;

        linhas = entrada.nextInt();

        for (int i = 0; i < linhas; i++) {
            System.out.printf("%d %d %d PUM\n", numero1, numero2, numero3);

            numero1 += 4;
            numero2 += 4;
            numero3 += 4;
        }

        entrada.close();
    }
}
