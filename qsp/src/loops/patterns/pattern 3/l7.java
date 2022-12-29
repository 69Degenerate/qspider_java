public class l7 {
    public static void main(String[] args) {
        int a=5,b=a;
        char m='a';
        int n=1;
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= b; j++) {
                System.out.print(i%2==1?(n++)+" ":(m++)+" ");
            }
            System.out.println();
            b--;
        }
    }
}
