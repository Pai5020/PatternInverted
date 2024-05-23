public class Main {
    public static void main(String[] args) {
        int i, j;

        for (i = 1; i <= 7; i += 2) {
            for (j = 1; j <= 7; j++) {
                if (j < 7 - i + 1) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }

        for (i = 7; i >= 1; i -= 2) {
            for (j = 1; j <= 7; j++) {
                if (j <= 7 - i) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
