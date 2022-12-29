public class l4 {
    public static void main(String[] args) {
        int a=5,b=a;
        for (int i = 1; i <= a; i++,b--) {
            // char c ='a';
            for (int j = 1; j <= b; j++) {
                    System.out.print((char)(96+j));
                    // c++;
            }            
            System.out.println();
            // b--;
        }
    }
}
