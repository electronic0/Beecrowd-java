import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int linhas;

        linhas = entrada.nextInt();

        for (int i = 1; i <= linhas; i++) {
            for (int y = 0; y < 2; y++) {
                System.out.printf("%d %d %d\n", i, i * i + y, i * i * i + y);
            }
        }

        entrada.close();
    }
}
