import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int testes, numero;
        int dentro = 0;
        int fora = 0;

        testes = entrada.nextInt();

        for (int i = 0; i < testes; i++) {
            numero = entrada.nextInt();

            if (numero >= 10 && numero <= 20) {
                dentro++;
            } else {
                fora++;
            }
        }

        System.out.println(dentro + " in");
        System.out.println(fora + " out");

        entrada.close();
    }
}
