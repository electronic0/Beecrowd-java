import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int testes, numero;
        String resultado;

        testes = entrada.nextInt();

        for (int i = 0; i < testes; i++) {
            numero = entrada.nextInt();
            resultado = "";

            if (numero % 2 == 0) {
                resultado += "EVEN ";
            } else {
                resultado += "ODD ";
            }

            if (numero < 0) {
                resultado += "NEGATIVE";
            } else if (numero > 0) {
                resultado += "POSITIVE";
            } else {
                resultado = "NULL";
            }

            System.out.println(resultado);
        }

        entrada.close();
    }
}
