import java.util.*;

class d{
	int num=10;
	String str="21";
	void m1(){
		System.out.println("hello");
	}
	static int num2=10;
	static String str2="22";
	static void m2(){
		System.out.println("hello");

	}
}

class demo{
	public static void main(String args[]){
		d dd=new d();
		dd.m1();
		System.out.println(dd.str);
		System.out.println(dd.num);
		System.out.println();
		System.out.println(d.str2);
		System.out.println(d.num2);
		d.m2();
	}
}
