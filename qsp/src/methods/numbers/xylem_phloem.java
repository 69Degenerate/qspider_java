package methods.numbers;
import java.util.*;
public class xylem_phloem {
    static Scanner sc=new Scanner (System.in);
    static void xp(int n){
        int fl=0,min=0;
        fl+=n%10;
        n/=10;
        while (n>9) {
            min+=n%10;
            n/=10;
        }
        fl+=n%10;
        System.out.println(fl==min?"xylem":"phloem");
    }
    public static void main(String[] args) {
        int n=sc.nextInt();
        xp(n);
    }
}
