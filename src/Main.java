public class Main {
    public static void main(String[] args) {
        int i, j,k;

        for (i= 0; i<=6 ; i++) {

            if (i % 2 != 0) {

                for (j = i; j < 6; j++) {
                    System.out.print(" ");
                }

                for (k = 1; k <= i; k++) {
                    System.out.print("*");
                }
                System.out.println(" ");
            }
        }
        for (i=5; i>=1; i--) {
            if (i % 2 != 0) {
                for (j = i; j <= 5; j++) {
                    System.out.print(" ");
                }
                for (k = 1; k <= i; k++) {
                    System.out.print("*");
                }
                System.out.println("");
            }
        }
    }
}
