import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numero1, numero2;
        int soma = 0;

        numero1 = entrada.nextInt();
        
        do {
            numero2 = entrada.nextInt();
        } while (numero2 <= 0);

        for (int i = 0; i < numero2; i++) {
            soma += numero1 + i;
        }

        System.out.println(soma);
                        
        entrada.close();
    }
}