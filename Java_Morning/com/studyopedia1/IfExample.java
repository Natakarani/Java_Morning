package com.studyopedia1;

public class IfExample {
	static int a=11;
	public static int checkOdd() {
		if(a%2==1) {
			return 0;
		}
		return -1;
	}

	public static void main(String[] args) {
		System.out.println(checkOdd());
		

	}

}
