public class l8 {
    public static void main(String[] args) 
    {
        int a=5;
        int n=1;
        char c='a';
        for (int i = 1; i <= a; i++) 
        {
            for (int j = 1; j <= a; j++) 
            {
                if (i<=j) 
                {
                    System.out.print(i%2==0?n:"*");
                } 
                else 
                {
                    System.out.print(" ");
                }
            }
            n=i%2==0?n+1:n;
            System.out.println();
        }
    }
}
