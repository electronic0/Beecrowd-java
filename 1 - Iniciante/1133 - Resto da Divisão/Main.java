import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numero1, numero2, numeroTemporario;

        numero1 = entrada.nextInt();
        numero2 = entrada.nextInt();

        if (numero1 > numero2) {
            numeroTemporario = numero1;
            numero1 = numero2;
            numero2 = numeroTemporario;
        }

        for (int i = numero1 + 1; i < numero2; i++) {
            if (i % 5 == 2 || i % 5 == 3) {
                System.out.println(i);
            }
        }

        entrada.close();
    }
}
