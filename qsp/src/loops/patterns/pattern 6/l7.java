public class l7 {
    public static void main(String[] args) {
        int n=6;
        for (int i = 1; i <= n; i++) {
            int a=i+1;
            for (int j = 1; j <= n; j++) {
                if (j==1||j==n||i==1||i==n) {
                    System.out.print("  *");
                } else {
                    System.out.print("  "+a++);
                }
            }
            System.out.println();
        }
    }
}

// * * * * *
// * 3 4 5 *
// * 4 5 6 *
// * 5 6 7 *
// * * * * *