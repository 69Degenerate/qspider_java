public class l2 {
    public static void main(String[] args) {
        int a=5,b=a;
        for (int i = 1; i <= a; i++) {
            int n=1;
            for (int j = 1; j <= a; j++) {
                if (b<=j) {
                    System.out.print(n++);
                } else {
                    System.out.print(" ");
                }
            }
            b--;
            System.out.println();
        }
    }
}
