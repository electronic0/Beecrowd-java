import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numero1, numero2;

        do {
            numero1 = entrada.nextInt();
            numero2 = entrada.nextInt();

            if (numero1 > numero2) {
                System.out.println("Decrescente");
            } else if (numero1 < numero2) {
                System.out.println("Crescente");
            }     
        } while (numero1 != numero2);

        entrada.close();
    }
}
