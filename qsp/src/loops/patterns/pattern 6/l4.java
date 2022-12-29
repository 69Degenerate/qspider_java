public class l4 {
    public static void main(String[] args) {
        int n=10;
        for (int i = 1; i <= n; i++) {
            int a=1;
            for (int j = 1; j <= n; j++) {
                if (j==1||j==n||i==1||i==n) {
                    System.out.print(" *");
                } else {
                    System.out.print(" "+a++);
                }
            }
            System.out.println();
        }
    }
}
/*

 * * * * * * * * * *
 * 1 2 3 4 5 6 7 8 *
 * 1 2 3 4 5 6 7 8 *
 * 1 2 3 4 5 6 7 8 *
 * 1 2 3 4 5 6 7 8 *
 * 1 2 3 4 5 6 7 8 *
 * 1 2 3 4 5 6 7 8 *
 * 1 2 3 4 5 6 7 8 *
 * 1 2 3 4 5 6 7 8 *
 * * * * * * * * * *

 */