//construtor: it is special function. 
//it name should be same as a classname
//syntax: access_modifier classname(){}
//and we can also say that constructor creates the obj
//we can identify the constructor by which method having the same class called constructor
//normally in method when we call without creating shows error but constructor not bcz default constructor is alraedy there.JVM already created the default constructoe
//constructor are two types
//1}default constructor 
//2}parameterized constructor
//when we created a default constructor called it asa no-argument constructor
/*public class Constructor_I{
	public Constructor_I(){
		System.out.println("const created");
	}
	
	public static void main(String[] args){
		//see here looking like a method calling(Box();) so that constructor called
		Constructor_I box=new Constructor_I();
		Constructor_I box1=new Constructor_I();
		//two times default constructor printed bcz we called it two times(obj creation)
		
	}
}
*/

/*
class Car{
	public Car(){
		System.out.println(this.hashCode());
		
	}
}

public class Constructor_I{
	public static void main(String[] args){
		Car c=new Car();
		System.out.println(c.hashCode());
		Car c1=new Car();
		System.out.println(c1.hashCode());

	
}
}

*/

/*
 class StudentInfo{
	int studentId;
	String studentName;
	StudentInfo(int studentId,String studentName){
		studentId=studentId;//without this JVM get confused that which is instance and which is local
		studentName=studentName;
		
	}
	public String toString(){
		return "studentId: "+studentId+" studentName:this "+studentName;
	}
	
}
public class Constructor_I{
	public static void main(String[] args){
		StudentInfo c=new StudentInfo(101,"man");
		System.out.println(c);
		
	}
}
*/




