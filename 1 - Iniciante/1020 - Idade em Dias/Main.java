import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int tempo, anos, meses;

        tempo = entrada.nextInt();

        anos = tempo / 365;
        tempo -= anos * 365;

        meses = tempo / 30;
        tempo -= meses * 30;

        System.out.println(anos + " ano(s)");
        System.out.println(meses + " mes(es)");
        System.out.println(tempo + " dia(s)");

        entrada.close();
    }
}