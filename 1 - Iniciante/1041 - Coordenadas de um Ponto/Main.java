import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        float X, Y;

        X = entrada.nextFloat();
        Y = entrada.nextFloat();

        if (X == 0 && Y == 0) {
            System.out.println("Origem");
        } else if (X > 0 && Y > 0) {
            System.out.println("Q1");
        } else if (X < 0 && Y > 0) {
            System.out.println("Q2");
        } else if (X < 0 && Y < 0) {
            System.out.println("Q3");
        } else if (X > 0 && Y < 0) {
            System.out.println("Q4");
        } else if (Math.abs(X) > 0 && Y == 0) {
            System.out.println("Eixo X");
        } else {
            System.out.println("Eixo Y");
        }

        entrada.close();
    }
}
