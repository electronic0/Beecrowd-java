import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int senha;

        senha = entrada.nextInt();

        System.out.println(senha + 1);

        entrada.close();
    }
}