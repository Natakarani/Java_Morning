package com.studyopedia1;

public class Variable_I {
int a=200;
	public static void main(String[] args) {
		//instance variable
		//variable declared outside the method without using static keyword
		//obj required to access instance var
		//syntax: datatype varname=value;
		//every obj maintains  its own copy of value
		Variable_I obj=new Variable_I();
		Variable_I obj1=new Variable_I();
		System.out.println("---------");
		System.out.println("before modification");
		System.out.println(obj.a);
		System.out.println(obj1.a);
		obj.a=400;
		System.out.println("after modification");
		System.out.println(obj.a);
		System.out.println(obj1.a);
		
	}

}
