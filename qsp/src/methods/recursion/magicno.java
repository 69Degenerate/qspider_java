package methods.recursion;
import java.util.*;;
public class magicno {
    public static void main(String[]args)
	{
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int sum=0;
       
		System.out.println(isMagic(num,sum));
      }
public static int isMagic(int a,int b){
    int num=0;
    while (a>0) {
        b=b+a%10;
        a/=10;
    }
    if (b>9) {
        return isMagic(b, 0);
    }
    num = b==1?1:0;
    return num;
}
}
