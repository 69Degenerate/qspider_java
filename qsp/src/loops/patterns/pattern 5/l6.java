public class l6 {
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
                    if (i%2==1)
                    {
                        System.out.print(n);
                    } 
                    else 
                    {
                        System.out.print(c);
                    }
                } 
                else 
                {
                    System.out.print(" ");
                }
            }
            if (i%2==1) 
            {
                n++;
            } 
            else 
            {
                c++;
            }
            System.out.println();
        }
    }
}
