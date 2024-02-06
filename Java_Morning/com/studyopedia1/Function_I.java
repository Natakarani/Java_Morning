package com.studyopedia1;
/*
public class Function_I {
	int a=100;
	static int b=400;
public void m1() {
	System.out.println(a);
	System.out.println(b);
}
public static void m2() {
	System.out.println(b);
	System.out.println(b);
	System.out.println(new Function_I().a);
}
	public static void main(String[] args) {
		

	}

}
*/




public class Function_I{
	public int simpleInterest() {
		int p=40000;
		int t=2;
		int r=5;
		int s=(p*t*r)/100;
		return s;
	}
public static void main(String[] args) {
	Function_I f=new Function_I();
	System.out.println(f.simpleInterest());
	
		

	}
	
}