public class l1 {
    public static void main(String[] args) {
        int a=0;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                if (i%2==0){
                    System.out.print(++a);
                }
                else{
                    System.out.print(i+a--);
                }
            }
            System.out.println();
        }
    }
}
