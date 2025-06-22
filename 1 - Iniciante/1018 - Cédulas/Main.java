import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int valor, valorLido, cem, cinquenta, vinte, dez, cinco, dois;

        valor = entrada.nextInt();

        valorLido = valor;

        cem = valor / 100;
        valor -= cem * 100;

        cinquenta = valor / 50;
        valor -= cinquenta * 50;

        vinte = valor / 20;
        valor -= vinte * 20;

        dez = valor / 10;
        valor -= dez * 10;

        cinco = valor / 5;
        valor -= cinco * 5;

        dois = valor / 2;
        valor -= dois * 2;

        System.out.println(valorLido);
        System.out.println(cem + " nota(s) de R$ 100,00");
        System.out.println(cinquenta + " nota(s) de R$ 50,00");
        System.out.println(vinte + " nota(s) de R$ 20,00");
        System.out.println(dez + " nota(s) de R$ 10,00");
        System.out.println(cinco + " nota(s) de R$ 5,00");
        System.out.println(dois + " nota(s) de R$ 2,00");
        System.out.println(valor + " nota(s) de R$ 1,00");

        entrada.close();
    }
}
