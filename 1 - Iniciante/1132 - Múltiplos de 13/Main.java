import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numero1, numero2, numeroTemporario;
        int total = 0;

        numero1 = entrada.nextInt();
        numero2 = entrada.nextInt();

        if (numero1 > numero2) {
            numeroTemporario = numero1;
            numero1 = numero2;
            numero2 = numeroTemporario;
        }

        for (int i = numero1; i < numero2 + 1; i++) {
            if (i % 13 != 0) {
                total += i;
            }
        }

        System.out.println(total);

        entrada.close();
    }
}
