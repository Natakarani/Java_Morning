package com.studyopedia1;

public class This_III {
	int a=10;
This_III(){
	this(10);
		System.out.println("default const created");
	}
	This_III(int a){
		
		this.a=a;
		System.out.println(this.a);
		
	}

	public static void main(String[] args) {
		This_III t1=new This_III();

	}

}
/*





public class This_III {
	int a=10;
This_III(){
	
		
		System.out.println("default const created");
	}
	This_III(int a){
		this();
		this.a=a;
		System.out.println(this.a);
		
	}

	public static void main(String[] args) {
		This_III t1=new This_III(88);

	}

}

*/
