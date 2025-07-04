import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String classe, subclasse, ordem;

        classe = entrada.nextLine();
        subclasse = entrada.nextLine();
        ordem = entrada.nextLine();

        if (classe.equals("vertebrado")) {
            if (subclasse.equals("ave") && ordem.equals("carnivoro")) {
                System.out.println("aguia");
            } else if (subclasse.equals("ave") && ordem.equals("onivoro")) {
                System.out.println("pomba");
            } else if (subclasse.equals("mamifero") && ordem.equals("onivoro")) {
                System.out.println("homem");
            } else if (subclasse.equals("mamifero") && ordem.equals("herbivoro")) {
                System.out.println("vaca");
            }
        } else {
            if (subclasse.equals("inseto") && ordem.equals("hematofago")) {
                System.out.println("pulga");
            } else if (subclasse.equals("inseto") && ordem.equals("herbivoro")) {
                System.out.println("lagarta");
            } else if (subclasse.equals("anelideo") && ordem.equals("hematofago")) {
                System.out.println("sanguessuga");
            } else if (subclasse.equals("anelideo") && ordem.equals("onivoro")) {
                System.out.println("minhoca");
            }
        }
        
        entrada.close();
    }
}
