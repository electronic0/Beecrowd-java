import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double renda;
        double resultado = 0;

        renda = entrada.nextDouble();

        if (renda >= 0 && renda <= 2000) {
            System.out.println("Isento");
        } else if (renda > 2000 && renda <= 3000) {
            renda -= 2000;
            resultado = renda * 0.08;
            System.out.printf("R$ %.2f\n", resultado);
        } else if (renda > 3000 && renda <= 4500) {
            renda -= 3000;
            resultado = renda * 0.18 + 1000 * 0.08;
            System.out.printf("R$ %.2f\n", resultado);
        } else {
            renda -= 4500;
            resultado = renda * 0.28 + 1500 * 0.18 + 1000 * 0.08;
            System.out.printf("R$ %.2f\n", resultado);
        }

        entrada.close();
    }
}
