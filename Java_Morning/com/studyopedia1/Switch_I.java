package com.studyopedia1;
import java.util.Scanner;
public class Switch_I {
public static void add(int a,int b) {
	System.out.println(a+b);
}
public static void sub(int a,int b) {
	System.out.println(a-b);
}
public static void mul(int a,int b) {
	System.out.println(a*b);
}
	public static void main(String[] args) {
		 char res='o';
		 Scanner sc=new Scanner(System.in);
		
		 do {
			 System.out.println("press anyone from 1 to 3");
			 int enter=sc.nextInt();
			 switch(enter) {
			 case 1:add(1,8);break;
			 case 2:sub(8,1);break;
			 case 3:mul(1,8);break;
			 default:System.out.println("no one is matched from above options");
			
			 }
			 System.out.println("press y/n");
			 res= sc.next().charAt(0);

		 }
		 while(res=='y');
		 System.out.println("comes out of loop");
		 
	}

}
