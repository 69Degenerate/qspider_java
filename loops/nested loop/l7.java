public class l7 {
    public static void main(String[] args) {
        for (int i = 1; i < 6; i++) {
            for (int j = 1; j < 6; j++) {
                System.out.print(j%2==0?" +":" *");
            }
            System.out.println();
        }
    }
}
