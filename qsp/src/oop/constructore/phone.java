package constructore;
import java.util.*;
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
public class phone {
    static String name;
    static int price;
    static String sim;
    static String colour;
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {  
        input(); 
        ph p1=new ph(name,price,sim,colour);
        input();
        ph p2=new ph(name,price,sim,colour);
        input();
        ph p3=new ph(name,price,sim,colour);
        input();
        ph p4=new ph(name,price,sim,colour);
        input();
        ph p5=new ph(name,price,sim,colour);
        System.out.println("name\tprice\tsim\tcolour");
        display(p1.name, p1.price, p1.sim, p1.colour);
        display(p2.name, p2.price, p2.sim, p2.colour);
        display(p3.name, p3.price, p3.sim, p3.colour);
        display(p4.name, p4.price, p4.sim, p4.colour);
        display(p5.name, p5.price, p5.sim, p5.colour);
        
    }
    static void input(){
        System.out.println("enert");
        name=sc.next();
        price=sc.nextInt();
        sim=sc.next();
        colour=sc.next();
    }
    static void display(String n,int p,String s,String c){
        String str =n+"\t"+p+"\t"+s+"\t"+c+"\t";
        boolean tr =s=="null";
        
        if (s.equalsIgnoreCase("null")) {
            System.out.println(str);
            // System.out.println(tr);
            // System.out.println(s);
        }
        // System.out.println(str);

    }
    
}