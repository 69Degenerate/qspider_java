package methods.numbers;

public class Palindrom {
    public static void palindrom(int n) {
        int res=0,t=n;
        while (n>0) {
            res=res*10+n%10;
            n/=10;
        }
        System.out.println(res==t?"palindrom":"not palindrom");
    }
    public static void main(String[] args) {
        palindrom(1233214);
    }
}
