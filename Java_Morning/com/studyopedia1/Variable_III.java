package com.studyopedia1;

public class Variable_III {
public void localVariable() {
	int a=200;
	System.out.println(a);
	
	
}
public int local1() {
	int a=200;
	return a;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * local variable
		 * local var declared inside the method
		 * local var can be accessed inside method only 
		 * outside the method not allowed directly
		 * so for that need to call the method (which containing that var)
		 * if we want to use that
		 * 
		 * */
		Variable_III obj=new Variable_III();
		
		obj.localVariable();
		System.out.println("by using return type"+obj.local1());

	}

}
