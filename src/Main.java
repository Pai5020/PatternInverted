public class Main {
    public static void main(String[] args) {
        int i, j,k;

        for (i= 0; i<=6 ; i++)
        {
            for (j=i; j <6 ;j++)
            {
                System.out.print(" ");
            }
            for (k=1; k<=i;k++)
            {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        for (i=6; i>=0; i--)
        {
            for(j=i; j<=6;j++)
            {
                System.out.print(" ");
            }
            for(k=1; k<i ;k++)
            {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
