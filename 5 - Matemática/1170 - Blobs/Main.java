import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int testes, dias;
        double quantidade;

        testes = entrada.nextInt();
        
        for (int i = 0; i < testes; i++) {
            quantidade = entrada.nextDouble();
            dias = 0;

            while (quantidade > 1) {
                quantidade /= 2;
                dias++;
            }

            System.out.println(dias + " dias");
        }

        entrada.close();
    }
}