import java.util.*;

public class Main {
    public static void main(String[] a) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int ln=n%10;
        if (ln%2==0) {
            int fact=ln==0?0:1;
            while (ln!=0) {
                fact*=ln--;
            }
            System.out.println("factorial of "+n+" is "+fact);
        } else {
            int c=0,f=1;
            while (n>=f) {
                if (n%f==0) {
                    c++;
                }
                f++;
            }
            System.out.println(c==2?"prime":"not a prime");

        }
}}