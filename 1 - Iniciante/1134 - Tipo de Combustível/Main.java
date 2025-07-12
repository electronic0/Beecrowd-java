import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int opcao;
        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;

        do {
            opcao = entrada.nextInt();

            switch (opcao) {
                case 1: {
                    alcool++;
                    break;
                }

                case 2: {
                    gasolina++;
                    break;
                }

                case 3: {
                    diesel++;
                    break;
                }
            }

        } while (opcao != 4);

        System.out.println("MUITO OBRIGADO");
        System.out.printf("Alcool: %d\n", alcool);
        System.out.printf("Gasolina: %d\n", gasolina);
        System.out.printf("Diesel: %d\n", diesel);

        entrada.close();
    }
}
