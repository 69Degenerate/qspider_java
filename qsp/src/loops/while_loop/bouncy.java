package loops.while_loop;
import java.util.*;
public class bouncy {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        while(true){ 
            System.out.print("enter number::");
            int n=sc.nextInt();
            int decr=0,incr=0,count=0;
            if (n<=100) {
                System.out.println("0 to 100 are not allowed");
                System.exit(0);
            }
            while (n>0) {
                int last=n%10;
                n/=10;
                if (n==0) {
                    break;
                }
                if (last>n%10) {
                    incr++;
                }
                else{
                    decr++;
                }
                count++;
            }
            if (decr==count||incr==count) {
                System.out.println("not a bouncy number \n\n");
            } else {
                System.out.println("it's a bouncy number \n\n");
            }
        }
    }
}
