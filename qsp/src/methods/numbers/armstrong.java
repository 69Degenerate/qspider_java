package methods.numbers;
import java.util.*;
public class armstrong {
    static int power(int n,int p){
        int nn=1;
        while (p!=0) {
            nn*=n;
            p--;    
        }
        return nn;
    }
    static void arm(int n){
        int t=n,d=0,l=0,sum=0;
        while (t!=0) {
            d++;
            t/=10;
        }
        t=n;
        while (t!=0) {
            sum += power(t%10, d);
            t/=10;
        }
        System.out.println(n==sum?"it is a armstrong number":"it is a not armstrong number");
    }
    public static void main(String[] args) {
        arm(9474);
    }
}
