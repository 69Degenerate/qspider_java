import java.util.*;
class l3{
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int n=9,m=(n/2)+1;
        for (int i = 1; i <= n; i++) {
            int a=i;
            for (int j = 1; j <= n; j++) {
                if (i==m||j==m) {
                    System.out.print(" *" );
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
/*

         *        
         *
         *
         *
 * * * * * * * * *
         *
         *
         *
         *

 */