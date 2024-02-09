package com.studyopedia1;

public class Operators{
	public static void arithematicOperators() {
		int a=8;
		int b=18;
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
		System.out.println("-----");
		


	}
	public static void relationalOperator() 
	{
		int a=20;
		int b=15;//always gives result in boolean
		System.out.println(a>b);
		System.out.println(a>=b);
		System.out.println(a<b);
		System.out.println(a<=b);
		System.out.println(a==b);
		System.out.println(a!=b);
		System.out.println("-----");

	}
	public static void logicalOpeartor() {
		//compares more than one condition
		//if any of one is false and opertaor wont checks next one
		boolean x=true;
		boolean y=false;
		int m=10;
		int n=8;
		System.out.println(x && y);
		System.out.println((m>n) && (m!=n));
		System.out.println((m>n) || (m!=n));
		System.out.println(!(!(m>n) || (m!=n)));
		
		
	} 
	public static void unaryOperator() {
		int x=10;
		int y=0;
		y=x++;
		System.out.println(x+" "+y);
		y=++x;
		System.out.println(x+" "+y);
		
	}
	public static void assignmentOperator() {
		int a=12;
		int b=18;
		a+=10;//compounds statemants these are
		System.out.println(a);
		a-=4;
		System.out.println(a);
		System.out.println("--------");
	}
	public static void ternaryOperator() {
		int x=5;
		int y=10;
		int result=x>3?1:0;
		System.out.println(result);
		int result2=x<y?y!=x?1:0:2;
				System.out.println(result2);
				System.out.println("--------");
	}
	public static void bitwiseOperator() {//works on binary bits
		int x=10;
		int y=8;
		System.out.println(x&y);
		System.out.println(x|y);
		System.out.println(x^y);//both same result is 0
		System.out.println(~y); //-(y+1)
		System.out.println("--------");
	}
	public static void shiftOperator() {
		int x=8;//multiply by 2 at every shift
		System.out.println(x<<3);
		int y=12;
		System.out.println(y>>3);
		System.out.println("--------");
	};
	public static void instanceOf() {
		String str="java";//for to check the type of object it is useful
		if(str instanceof String) {
			System.out.println(str.toUpperCase());
		}
	}
	public static void main(String[] args) {
		Operators.arithematicOperators();
		Operators.relationalOperator();
Operators.logicalOpeartor();
Operators.unaryOperator();
Operators.assignmentOperator();
Operators.bitwiseOperator();
Operators.shiftOperator();
Operators.instanceOf();
	}

}
