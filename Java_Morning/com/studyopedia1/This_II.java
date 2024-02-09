package com.studyopedia1;

class Mobile{
	String brandName;
	int modelName;
	Mobile(String brandName,int modelName,String name1){
		this.brandName=brandName;
		this.modelName=modelName;
		this.brandName=name1;//here values getting updated 
		
		
	}
	public void show() {
		System.out.println(brandName+" "+modelName);
	}
	public void display() {
		this.show();
	}
	
}
public class This_II {

	
	public static void main(String[] args) {
		Mobile m=new Mobile("oppo",888,"vivo");
		m.show();
		

	}

}
