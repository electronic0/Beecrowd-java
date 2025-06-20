import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double nota1, nota2, media;

        nota1 = entrada.nextDouble();
        nota2 = entrada.nextDouble();

        media = (nota1 * 3.5 + nota2 * 7.5) / 11;

        System.out.printf("MEDIA = %.5f\n", media);

        entrada.close();
    }
}
