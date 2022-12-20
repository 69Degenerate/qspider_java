public class l8 {
    public static void main(String[] args) {
        int a=1;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                if (a>9) {
                    a=1;
                }
                System.out.print(a++*10+" ");
            }            System.out.println();
        }
    }
}
