import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int testes;
        double numero1, numero2, resultado;

        testes = entrada.nextInt();

        for (int i = 0; i < testes; i++) {
            numero1 = entrada.nextDouble();
            numero2 = entrada.nextDouble();
            resultado = numero1 / numero2;

            if (Double.isInfinite(resultado) || Double.isNaN(resultado)) {
                System.out.println("divisao impossivel");
            } else {
                System.out.println(resultado);
            }
        }

        entrada.close();
    }
}
