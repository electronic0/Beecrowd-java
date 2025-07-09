import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int testes;
        double totalCoelhos = 0;
        double totalRatos = 0;
        double totalSapos = 0;
        double percentualCoelhos, percentualRatos, percentualSapos, totalCobaias;

        testes = entrada.nextInt();

        for (int i = 0; i < testes; i++) {
            int quantidade = entrada.nextInt();
            char tipo = entrada.next().charAt(0);
            
            if (tipo == 'C') {
                totalCoelhos += quantidade;
            } else if (tipo == 'R') {
                totalRatos += quantidade;
            } else {
                totalSapos += quantidade;
            }

        }

        totalCobaias = totalCoelhos + totalRatos + totalSapos;

        percentualCoelhos = 100 / (totalCobaias / totalCoelhos);
        percentualRatos = 100 / (totalCobaias / totalRatos);
        percentualSapos = 100 / (totalCobaias / totalSapos);

        System.out.printf("Total: %.0f cobaias\n", totalCobaias);
        System.out.printf("Total de coelhos: %.0f\n", totalCoelhos);
        System.out.printf("Total de ratos: %.0f\n", totalRatos);
        System.out.printf("Total de sapos: %.0f\n", totalSapos);
        System.out.printf("Percentual de coelhos: %.2f %%\n", percentualCoelhos);
        System.out.printf("Percentual de ratos: %.2f %%\n", percentualRatos);
        System.out.printf("Percentual de sapos: %.2f %%\n", percentualSapos);

        entrada.close();
    }
}
