package methods.numbers;

import java.util.*;;

public class strongno {
    static Scanner sc = new Scanner(System.in);

    static void strong(int n) {
        int fact_n, lastdig,temp_n = n,total = 0;
        while (n != 0) {
            int i = 1;
            fact_n = 1;
            lastdig = n % 10;
            while (i <= lastdig) {
                fact_n *= i++;
            }
            total += fact_n;
            n /= 10;
        }
        System.out.println(total == temp_n ? temp_n + " is a strong number\n" : temp_n + " is not a strong number\n");
    }

    public static void main(String[] args) {
        strong(12);
    }
}
