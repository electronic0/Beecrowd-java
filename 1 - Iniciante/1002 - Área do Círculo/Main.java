import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double raio, area;
        double pi = 3.14159;

        raio = entrada.nextDouble();

        area = pi * Math.pow(raio, 2);

        System.out.printf("A=%.4f\n", area);

        entrada.close();
    }
}
