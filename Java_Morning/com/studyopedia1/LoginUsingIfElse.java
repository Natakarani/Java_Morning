package com.studyopedia1;

import java.util.Scanner;

class Db{
	private static final int userName=1234;
	private static final int password=6789;
	public static int getUser() {
		return Db.userName;
	}
	public static int getPassword() {
		return Db.password;
	}
}
public class LoginUsingIf {
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter username");
		int user=sc.nextInt();
		if(user==Db.getUser()) {
			System.out.println(user+"  username");
			System.out.println("enter password");
			int pass=sc.nextInt();
			if(pass==Db.getPassword()) {
				System.out.println("welcome "+user);
			}
			else {
				System.out.println("enter valis password");
			}
			
		}
		else {
			System.out.println("enter valid username");
		}
		

	}

}

