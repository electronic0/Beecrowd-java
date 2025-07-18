import java.util.Scanner;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int testes, quadrado; 
        BigInteger graos, gramas, kilogramas;

        testes = entrada.nextInt();

        for (int i = 0; i < testes; i++) {
            quadrado = entrada.nextInt();
            graos = BigInteger.valueOf(2).pow(quadrado).subtract(BigInteger.ONE);
            gramas = graos.divide(BigInteger.valueOf(12));
            kilogramas = gramas.divide(BigInteger.valueOf(1000));

            System.out.println(kilogramas + " kg");
        }

        entrada.close();
    }
}