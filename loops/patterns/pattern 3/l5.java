public class l5 {
    public static void main(String[] args) {
        int a=5,b=a;
        char c ='a';
        for (int i = 1; i <= a; i++,b--) {
            for (int j = 1; j <= b; j++) {
                    System.out.print(c++);
                    // c++;
            }            
            System.out.println();
            // b--;
        }
    }
}
