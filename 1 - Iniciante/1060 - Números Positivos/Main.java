import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        double numero;
        int numerosPositivo = 0;

        for (int i = 0; i < 6; i++) {
            numero = entrada.nextDouble();

            if (numero > 0) {
                numerosPositivo++;
            }
        }

        System.out.println(numerosPositivo + " valores positivos");

        entrada.close();
    }
}
