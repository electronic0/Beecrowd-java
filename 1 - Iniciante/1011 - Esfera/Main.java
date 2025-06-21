import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double volume, raio;
        double pi = 3.14159;

        raio = entrada.nextDouble();

        volume = (4.0 / 3.0) * pi * Math.pow(raio, 3);

        System.out.printf("VOLUME = %.3f\n", volume);

        entrada.close();
    }
}