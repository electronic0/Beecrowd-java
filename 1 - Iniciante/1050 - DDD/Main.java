import java.util.Scanner;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        HashMap<Integer, String> discagem = new HashMap<>();

        discagem.put(61, "Brasilia");
        discagem.put(71, "Salvador");
        discagem.put(11, "Sao Paulo");
        discagem.put(21, "Rio de Janeiro");
        discagem.put(32, "Juiz de Fora");
        discagem.put(19, "Campinas");
        discagem.put(27, "Vitoria");
        discagem.put(31, "Belo Horizonte");

        int DDD;

        DDD = entrada.nextInt();

        System.out.println(discagem.getOrDefault(DDD, "DDD nao cadastrado"));

        entrada.close();
    }
}
