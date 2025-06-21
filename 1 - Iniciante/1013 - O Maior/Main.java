import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numero1, numero2, numero3, maior;

        numero1 = entrada.nextInt();
        numero2 = entrada.nextInt();
        numero3 = entrada.nextInt();

        maior = numero1;

        if (numero2 > maior) {
            maior = numero2;
        }

        if (numero3 > maior) {
            maior = numero3;
        }

        System.out.println(maior + " eh o maior");

        entrada.close();
    }
}