public class l10 {
    public static void main(String[] args) {
        int a=1;
        for (int i = 1; i <= 5; i++) {
            int b=a+i;
            for (int j = 1; j <= i; j++) {
                System.out.print(i%2==1?a+" ":--b+" ");
                a++;
            }
            System.out.println();
        }
    }
}
