package methods.numbers;
import java.util.*;
public class factorial {
    static Scanner sc=new Scanner (System.in);
    static int fact(int n){
        int  t=(n==0?0:1);
        while (n!=0) {
            t*=n--;
        }
        return t;
    }
    public static void main(String[] args) {
        while (true) {
            int n= sc.nextInt();
            System.out.println(fact(n));
        }
    }
}
