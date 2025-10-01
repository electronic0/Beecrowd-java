import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        String palavra;

        palavra = entrada.nextLine().toLowerCase();

        switch (palavra) {
            case "oposicao": {
                System.out.println("mas");
                break;
            }
            
            case "contrariedade": {
                System.out.println("mas");
                break;
            }

            case "quantidade": {
                System.out.println("mais"); 
                break;
            }

            case "intensidade": {
                System.out.println("mais");
                break;
            }
        }

        entrada.close();
    }
}