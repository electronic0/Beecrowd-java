import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double A, B, C, semi, areaT, areaC, resultado;
        double pi = 3;

        A = entrada.nextDouble();
        B = entrada.nextDouble();
        C = entrada.nextDouble();

        if (A < B + C && B < A + C && C < A + B) {
            semi = (A + B + C) / 2;
            areaT = Math.sqrt(semi * (semi - A) * (semi - B) * (semi - C));
            areaC = (pi * Math.pow(C / 2, 2)) / 2;
            resultado = areaC + areaT;

            System.out.printf("AREA = %.0f\n", resultado);
        } else {
            System.out.println("Nao eh retangulo!");
        }
        
        entrada.close();
    }
}