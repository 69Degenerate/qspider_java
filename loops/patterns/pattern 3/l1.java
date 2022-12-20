public class l1 {
    public static void main(String[] args) {
        int a=5,b=a;
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= b; j++) {
                    System.out.print(j);
            }            
            System.out.println();
            b--;
        }
    }
}
