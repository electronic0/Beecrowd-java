import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numero;
        int pares = 0;

        for (int i = 0; i < 5; i++) {
            numero = entrada.nextInt();

            if (numero % 2 == 0) {
                pares++;
            }
        }

        System.out.println(pares + " valores pares");

        entrada.close();
    }
}
