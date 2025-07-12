import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int opcao;
        double nota1, nota2, media;

        do {
            nota1 = entrada.nextDouble();

            while (nota1 < 0 || nota1 > 10) {
                System.out.println("nota invalida");
                nota1 = entrada.nextFloat();
            }

            nota2 = entrada.nextDouble();

            while (nota2 < 0 || nota2 > 10) {
                System.out.println("nota invalida");
                nota2 = entrada.nextFloat();
            }

            media = (nota1 + nota2) / 2;

            System.out.printf("media = %.2f\n", media);

            do {
                System.out.println("novo calculo (1-sim 2-nao)");
                opcao = entrada.nextInt();

            } while (opcao != 1 && opcao != 2);

        } while (opcao != 2);

        entrada.close();
    }
}
