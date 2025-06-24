import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int [] lista;
        int [] listaSorteada;
        int numero1, numero2, numero3;

        numero1 = entrada.nextInt();
        numero2 = entrada.nextInt();
        numero3 = entrada.nextInt();
       
        lista = new int[] {numero1, numero2, numero3};
        listaSorteada = lista.clone();

        Arrays.sort(listaSorteada);

        for (int numero: listaSorteada) {
            System.out.println(numero);
        }
        
        System.out.println();

        for (int numero: lista) {
            System.out.println(numero);
        }

        entrada.close();
    }
}
