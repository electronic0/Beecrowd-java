import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        Double [] lista = new Double[3];
        double A, B, C;

        for (int i = 0; i < lista.length; i++) {
            lista[i] = entrada.nextDouble();
        }

        Arrays.sort(lista, Collections.reverseOrder());

        A = lista[0];
        B = lista[1];
        C = lista[2];

        if (A >= B + C) {
            System.out.println("NAO FORMA TRIANGULO");
        } else if (Math.pow(A, 2) == Math.pow(B, 2) + Math.pow(C, 2)) {
            System.out.println("TRIANGULO RETANGULO");
        } else if (Math.pow(A, 2) > Math.pow(B, 2) + Math.pow(C, 2)) {
            System.out.println("TRIANGULO OBTUSANGULO");
        } else if (Math.pow(A, 2) < Math.pow(B, 2) + Math.pow(C, 2)) {
            System.out.println("TRIANGULO ACUTANGULO");
        }

        if (A == B && B == C) {
            System.out.println("TRIANGULO EQUILATERO");
        } else if (A == B || C == B) {
            System.out.println("TRIANGULO ISOSCELES");
        }

        entrada.close();
    }
}
