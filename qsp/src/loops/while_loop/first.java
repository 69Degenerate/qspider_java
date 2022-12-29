package loops.while_loop;

public class first {
    public static void main(String[] args) {
        int a[]={12,321,4354,5465,46,7},i=0;
        while (i<a.length) {
            int n=i+1;
            System.out.printf("element number %d = %d \n",n,a[i]);
            i++;
        }
    }
}
