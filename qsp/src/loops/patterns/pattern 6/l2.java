import java.util.*;
class l2{
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int n=5;
        int a=1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(a++%2);
            }
            System.out.println();
        }
    }
}

// 1
// 01
// 010
// 1010
// 10101