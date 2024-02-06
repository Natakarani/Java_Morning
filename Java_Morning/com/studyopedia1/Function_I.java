package com.studyopedia1;

public class Function_I {
	int a=100;
	static int b=400;
public void m1() {
	System.out.println(a);
	System.out.println(b);
}
public static void  m3() {
	System.out.println("m3");
}
public static void m4() {
	m3();
	
}
public static void m2() {
	System.out.println(b);
	System.out.println(b);
	System.out.println(new Function_I().a);
}
	public static void main(String[] args) {
		Function_I f=new Function_I();
		f.m1();
		m2();
		m3();

	}

}



