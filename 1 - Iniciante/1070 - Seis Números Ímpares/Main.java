import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numero, i;
        int j = 0;

        numero = entrada.nextInt();
        i = numero;

        do {
            if (i % 2 != 0) {
                System.out.println(i);
                j++;
            }

            i++;
        } while (j < 6);

        entrada.close();
    }
}
