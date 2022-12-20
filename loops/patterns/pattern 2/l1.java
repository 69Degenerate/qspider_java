public class l1 {
    public static void main(String[] args) {
        int a=0;
        for (int i = 1; i <= 5; i++) {
            int b=i+a-1;
            for (int j = 1; j <= i; j++) {
                if (i%2==0){
                    System.out.print(a++);
                }
                else{
                    System.out.print(b--);
                    a++;
                }
            }
            System.out.println();
        }
    }
}
