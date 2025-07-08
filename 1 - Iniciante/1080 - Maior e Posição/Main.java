import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int [] numeros = new int[100];
        int maior = numeros[0];
        int posicao = 0;

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = entrada.nextInt();

            if (numeros[i] > maior) {
                maior = numeros[i];
                posicao = i;
            }
        }

        System.out.println(maior);
        System.out.println(posicao + 1);

        entrada.close();
    }
}
