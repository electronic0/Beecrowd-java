import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int X, Z;
        int quantidade = 0;

        X = entrada.nextInt();
        Z = entrada.nextInt();

        while (X >= Z) {
            Z = entrada.nextInt();
        }

        for (int i = 0; i < Z;) {
            i += X;
            quantidade++;
            X++;
        }
                   
        System.out.println(quantidade);

        entrada.close();
    }
}