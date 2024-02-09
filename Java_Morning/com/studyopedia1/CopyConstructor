package com.studyopedia1;
//without passing the values again and again passing the obj as reference, obj consists the values so we can access it
class Car{
	String regNumber;
	String modelNumber;
	String userName;
	Car(String registrationNo,String model,String name){
		regNumber=registrationNo;
		modelNumber=model;
		userName=name;
	}
	
	Car(Car obj){
		regNumber=obj.regNumber;
		modelNumber=obj.modelNumber;
		userName=obj.userName;
		
		
	}
	public void show() {
		regNumber=regNumber;
		modelNumber=modelNumber;
		userName=userName;
		System.out.println("reg: "+regNumber+" modelnumber: "+modelNumber+" userName: "+userName);
		
	}
	
}

public class CopyConstructor {

	public static void main(String[] args) {
		Car car=new Car("123","model1","567");
		car.show();
		car.modelNumber="888";//here values are updating so for next time printing the function the updated values get printed
		Car car2=new Car(car);
		car2.show();
		
	}

}
