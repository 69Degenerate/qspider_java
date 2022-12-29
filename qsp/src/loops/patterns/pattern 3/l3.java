public class l3 {
    public static void main(String[] args) {
        int a=5,b=a;
        char c ='a';
        for (int i = 1; i <= a; i++,b--) {
            for (int j = 1; j <= b; j++) {
                    System.out.print((char)(96+i));
            }            
            System.out.println();
            // b--;
        }
    }
}
