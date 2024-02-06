package com.studyopedia1;

public class Variable_II {
static int a=200;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//static variable
		//var declared outside the function
		//static keyword mandatory for the static var
		//it wont maintain own copy of value
		//we can access it by using the classname/obj name
		//but reconmended way is by using classname bcz when we use objname it shows some warning like use in a static way
		//syntax:static datatype varname=val;
		//static var get initialized during class loading
		
		System.out.println("using classname");
		System.out.println(Variable_II.a);
		System.out.println("by using objname");
		Variable_II obj=new Variable_II();
		Variable_II obj1=new Variable_II();
		System.out.println("--before modify---");
		System.out.println(Variable_II.a);
		System.out.println(Variable_II.a);
		
		Variable_II.a=400;
		System.out.println("after modify-----");
		System.out.println(Variable_II.a);
		System.out.println(Variable_II.a);

	}

}
