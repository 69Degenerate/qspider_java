package methods.numbers;

public class Fibonancy {
    public static void fibonancy(int n) {
        int p=0,c=1,t=n;
        for (int i = 0; i < t; i++) {
            System.out.println(p);
            n=p+c;
            p=c;
            c=n;
        }        
    }
    public static void main(String[] args) {
        fibonancy(12);
    }
}
