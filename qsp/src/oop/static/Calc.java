// package oop;
import java.util.*;
class Calc {
    static Scanner sc=new Scanner (System.in);
    public static void main(String[] args) {
        while (true) {
            System.out.println("1.add\n2.sub\n3.mul\n4.div\n5.rem\n6.exit");
            System.out.print("choose::");
            int n=sc.nextInt();
            System.out.println("enter number::");
            switch (n) {
                case 1:
                    Inneralc.add();
                    break;
                case 2:
                    Inneralc.sub();
                    break;
                case 3:
                    Inneralc.mul();
                    break;
                case 4:
                    Inneralc.div();
                    break;
                case 5:
                    Inneralc.rem();
                    break;
                case 6:
                    Inneralc.exit();
                    break;
                default:
                    break;
            }
        }
    }
}
class Inneralc {
    static Scanner sc=new Scanner (System.in);
    static int data=0;
    public static void add() {
        int a=sc.nextInt();
        System.out.println(data+=a);
    }
    public static void sub() {
        int a=sc.nextInt();
        System.out.println(data-=a);
    }
    public static void mul() {
        int a=sc.nextInt();
        System.out.println(data*=a);
    }
    public static void div() {
        int a=sc.nextInt();
        System.out.println(data/=a);
    }
    public static void rem() {
        int a=sc.nextInt();
        System.out.println(data%=a);
    }
    public static void exit() {
        System.exit(1);
    }
}
