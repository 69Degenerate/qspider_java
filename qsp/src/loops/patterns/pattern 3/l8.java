public class l8 {
    public static void main(String[] args) {
        int a=5,b=a;
        for (int i = 1; i <= a; i++) {
            
            for (int j = 1,n=1; j <= b; j++,n+=2) {
                System.out.print((n)+" ");
            }
            System.out.println();
            b--;
        }
    }
}
