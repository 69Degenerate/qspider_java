public class l7 {
    public static void main(String[] args) {
        int a=5,b=0;
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= a; j++) {
                if (i<=j) {
                    System.out.print(b++%2);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
