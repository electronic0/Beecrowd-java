import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        float nota1, nota2, nota3, nota4, notaExame, media;

        nota1 = entrada.nextFloat();
        nota2 = entrada.nextFloat();
        nota3 = entrada.nextFloat();
        nota4 = entrada.nextFloat();

        media = (nota1 * 2 + nota2 * 3 + nota3 * 4 + nota4 * 1) / 10;

        System.out.printf("Media: %.1f\n", media);

        if (media >= 7) {
            System.out.println("Aluno aprovado.");
        } else if (media >= 5 && media <= 6.9) {
            System.out.println("Aluno em exame.");
            notaExame = entrada.nextFloat();

            System.out.printf("Nota do exame: %.1f\n", notaExame);
            media = (notaExame + media) / 2;

            if (media >= 5) {
                System.out.println("Aluno aprovado.");
            } else {
                System.out.println("Aluno reprovado.");
            }

            System.out.printf("Media final: %.1f\n", media);
        } else {
            System.out.println("Aluno reprovado.");
        }

        entrada.close();
    }
}
