public class Main {
    public static void main(String[] args) {
        for (double i = 0; i <= 2; i += 0.2) {
            for (int j = 1; j <= 3; j++) {
                if (i == 0 || i == 1 || i > 1.8) {
                    System.out.printf("I=%.0f J=%.0f\n", i, i + j);
                } else {
                    System.out.printf("I=%.1f J=%.1f\n", i, i + j);
                }
            }
        }
    }
}
