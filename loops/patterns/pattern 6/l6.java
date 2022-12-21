public class l6 {
    public static void main(String[] args) {
        int n=5,a=n;
        for (int i = 0; i <= n; i++) {
            a-=i;
            for (int j = 1; j <= n; j++) {
                if (j<=i) {
                    System.out.print(++a);
                } else {
                    System.out.print(" ");

                }
            }
            System.out.println();
        }
    }
}
/*
5
45
345
2345
12345
*/