public class l4 {
    public static void main(String[] args) {
        int a=5;
        char b='a';
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= a; j++) {
                if (i<=j) {
                    System.out.print((char)b++);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}