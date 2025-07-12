import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int grenais = 0;
        int vitoriasInter = 0;
        int vitoriasGremio = 0;
        int empates = 0;
        int golsInter, golsGremio, opcao;

        do {
            golsInter = entrada.nextInt();
            golsGremio = entrada.nextInt();
            grenais++;

            if (golsInter > golsGremio) {
                vitoriasInter++;
            } else if (golsInter < golsGremio) {
                vitoriasGremio++;
            } else {
                empates++;
            }

            System.out.println("Novo grenal (1-sim 2-nao)");
            opcao = entrada.nextInt();
        } while (opcao != 2);

        System.out.printf("%d grenais\n", grenais);
        System.out.printf("Inter:%d\n", vitoriasInter);
        System.out.printf("Gremio:%d\n", vitoriasGremio);
        System.out.printf("Empates:%d\n", empates);

        if (vitoriasInter > vitoriasGremio) {
            System.out.println("Inter venceu mais");
        } else if (vitoriasInter < vitoriasGremio) {
            System.out.println("Gremio venceu mais");
        } else {
            System.out.println("Nao houve vencedor");
        }

        entrada.close();
    }
}
