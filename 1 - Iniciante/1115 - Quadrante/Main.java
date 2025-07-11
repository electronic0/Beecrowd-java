import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int valorX, valorY;

        while (true) {
           
            valorX = entrada.nextInt();
            valorY = entrada.nextInt();

            if (valorX == 0 || valorY == 0) {
                break;
            }

            if (valorX > 0 && valorY > 0) {
                System.out.println("primeiro");
            } else if (valorX < 0 && valorY > 0) {
                System.out.println("segundo");
            } else if (valorX < 0 && valorY < 0) {
                System.out.println("terceiro");
            } else {
                System.out.println("quarto");
            }
        }

        entrada.close();
    }
}
