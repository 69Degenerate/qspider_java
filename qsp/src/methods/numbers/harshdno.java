package methods.numbers;

public class harshdno {
    public static void harshd(int no) {
        int t=no,sum=0;
        while (t>0) {
            sum+=t%10;
            t/=10;
        }
        // System.out.println(no);
        // System.out.println(sum);
        // System.out.println(no%sum);
        System.out.println(no%sum==0?"harshad number":"not harshad number");
    }
    public static void main(String[] args) {
        harshd(1556);
    }
}
