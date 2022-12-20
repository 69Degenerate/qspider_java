public class l6 {
    public static void main(String[] args) {
        int a=5,b=a,m=1;
        int n=1;
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= b; j++) {
                System.out.print(i%2==1?(n++)+" ":" ");
            }
            n=(i%2==0?n:5*++m);
            System.out.println();
            b--;
        }
    }
}
