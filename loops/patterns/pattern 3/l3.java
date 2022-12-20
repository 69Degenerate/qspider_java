public class l3 {
    public static void main(String[] args) {
        int a=5,b=a;
        char c ='a';
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= b; j++) {
                    System.out.print(c);
            }            
            System.out.println();
            b--;
            c++;
        }
    }
}
