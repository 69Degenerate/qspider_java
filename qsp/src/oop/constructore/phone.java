package constructore;
import java.util.*;
public class phone {
    static String name;
    static int price;
    static String sim;
    static String colour;
    static int count=0;
    static Scanner sc=new Scanner(System.in);
    static int rescount=0;
    public static void main(String[] args) {  
        input(); 
        ph p1=new ph(name,price,sim,colour);
        input();
        // ph p2=new ph(name,price,sim,colour);
        // input();
        // ph p3=new ph(name,price,sim,colour);
        // input();
        // ph p4=new ph(name,price,sim,colour);
        // input();
        // ph p5=new ph(name,price,sim,colour);
        System.out.println("\tname\tprice\tsim\tcolour");
        display(p1.name, p1.price, p1.sim, p1.colour);
        // display(p2.name, p2.price, p2.sim, p2.colour);
        // display(p3.name, p3.price, p3.sim, p3.colour);
        // display(p4.name, p4.price, p4.sim, p4.colour);
        // display(p5.name, p5.price, p5.sim, p5.colour);
        
    }
    static void input(){
        count++;
        System.out.print("\nname for pen no "+count+":");
        name=sc.next();
        System.out.print("\nprice for pen no "+count+":");
        price=sc.nextInt();
        System.out.print("\nsim for pen no "+count+":");
        sim=sc.next();
        System.out.print("\ncolour for pen no "+count+":");
        colour=sc.next();
    }
    static void display(String n,int p,String s,String c){
        if (s.equalsIgnoreCase("null")) {
            System.out.println((++rescount)+")\t"+n+"\t"+p+"\t"+s+"\t"+c+"\t");
        }
    }
    
}
class ph{
    String name;
    int price;
    String sim;
    String colour;
    ph(){}
    ph(String n,int p,String s,String c){
        name=n;
        price=p;
        sim=s;
        colour=c;
    }
}