import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ArrayList<Integer> idades = new ArrayList<>();
        
        int idade;
        float media;
        float total = 0;

        while (true) {
            idade = entrada.nextInt();

            if (idade < 0) {
                break;
            }

            idades.add(idade);
        }

        for (float i: idades) {
            total += i;
        }

        media = total / idades.size();

        System.out.printf("%.2f\n", media);

        entrada.close();
    }
}