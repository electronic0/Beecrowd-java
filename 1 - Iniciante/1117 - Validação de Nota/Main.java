import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double nota1, nota2, media;

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

        entrada.close();
    }
}
