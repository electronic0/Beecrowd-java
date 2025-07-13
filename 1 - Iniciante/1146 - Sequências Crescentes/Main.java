import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numero;

        while (true) {
            numero = entrada.nextInt();

            if (numero == 0) {
                break;
            }

            for (int i = 1; i <= numero; i++) {
                if (i == numero) {
                    System.out.print(i);
                } else {
                    System.out.print(i + " ");
                }
            }
            
            System.out.println();
        }

        entrada.close();
    }
}