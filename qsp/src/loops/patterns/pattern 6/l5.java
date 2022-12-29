public class l5 {
    public static void main(String[] args) {
        int n=10;
        int a=1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j==1||i==n||j==a) {
                    System.out.print(" *");
                } else {
                    System.out.print("  ");
                }
            }
            a++;
            System.out.println();
        }
    }
}
/*
 *
 * *
 *   *
 *     *
 *       *
 *         *
 *           *
 *             *
 *               *
 * * * * * * * * * *
*/