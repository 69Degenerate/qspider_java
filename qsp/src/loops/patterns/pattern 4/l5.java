public class l5 {
    public static void main(String[] args) {
        int a=5,b=a;
        char n='A';
        for (int i = 1; i <= a; i++) {
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
