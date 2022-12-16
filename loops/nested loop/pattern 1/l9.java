public class l9 {
    public static void main(String[] args) {
        for (int i = 1; i < 6; i++) {
            for (int j = 1; j < 6; j++) {
                System.out.print((i%2==0)?(j*2+"  "):(j*5+" "));
            }
            System.out.println();
        }
    }
}
