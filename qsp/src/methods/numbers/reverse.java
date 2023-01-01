package methods.numbers;

public class reverse {
    public static void rev(int n) {
        int res=0;
        while (n>0) {
            res=res*10+n%10;
            n/=10;
        }
        System.out.println(res);
    }
    public static void main(String[] args) {
        rev(12345);
    }
}
