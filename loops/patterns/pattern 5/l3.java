public class l3 {
    public static void main(String[] args) {
        int a=5,b=a;
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= a; j++) {
                System.out.print(i<=j?j:" ");
            }
            System.out.println();
        }
    }
}
