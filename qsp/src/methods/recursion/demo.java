package methods.recursion;

public class demo {
    public static void demo(int n) {
        if (n<10) {
            demo(++n);
        }
        System.out.println("sad");
    }
    public static void main(String[] args) {
        // System.out.println(demo(2));
        demo(1);
    }
}
