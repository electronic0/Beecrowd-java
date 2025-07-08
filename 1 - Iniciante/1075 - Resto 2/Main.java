import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numero;

        numero = entrada.nextInt();

        for (int i = 1; i <= 10000; i++) {
            if (i % numero == 2) {
                System.out.println(i);
            }
        }

        entrada.close();
    }
}
