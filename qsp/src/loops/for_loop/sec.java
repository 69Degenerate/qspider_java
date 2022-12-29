package loops.for_loop;

import java.util.Scanner;

public class sec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("No of elements in a array:");
        int no = sc.nextInt();
        int arr[]= new int[no];
        for (int i = 0; i < no; i++) {
            System.out.printf("element no %d:",i+1);
            int ele = sc.nextInt();
            arr[i]=ele;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+",");
        }
    }
}
