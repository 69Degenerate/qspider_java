import java.util.*;
class sec{
 public static void main(String[] args) {
    Scanner sc=new Scanner (System.in);
    while (true) {
        
        long n=sc.nextInt();
        long t=(n==0?0:1);
        while (n!=0) {
            t*=n--;
        }
        System.out.println(t);
    }
 }   
}