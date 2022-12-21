import java.util.*;
class l1{
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int n=5;
        for (int i = 1; i <= n; i++) {
            int a=i;
            for (int j = 1; j <= n; j++) {
                System.out.print(a++);
            }
            System.out.println();
        }
    }
}

// 12345
// 23456
// 34567
// 45678
// 56789