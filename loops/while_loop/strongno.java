import java.util.*;
public class strongno {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        while (true) {
            int fact_n,lastdig;
            System.out.print("\nEnter the number : " );
            int n = sc.nextInt();
            int total = 0;
            int temp_n = n;
            while(n != 0)
            {
            int i = 1;
            int fact_n = 1;
            int lastdig = n % 10;
            while(i <= lastdig)
            {
            fact_n = fact_n * i;
            i++;
            }
            total = total + fact_n;
            n = n / 10;
            }
            System.out.println(total == temp_n?temp_n + " is a strong number\n":temp_n + " is not a strong number\n");

        }
    }
}
