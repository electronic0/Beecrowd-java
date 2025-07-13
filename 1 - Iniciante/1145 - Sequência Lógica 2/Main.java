import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int coluna, numero;

        coluna = entrada.nextInt();
        numero = entrada.nextInt();
        
        for (int i = 1; i < numero + 1; i++) {
            if (i % coluna == 0) {
                System.out.printf("%d", i);
                System.out.println("");
            } else {
                System.out.printf("%d ", i);
            }
        }

        entrada.close();
    }
}