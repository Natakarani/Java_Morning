/*class Student{
	int StudentId=101;
	String studentName="manee";
	//creating default const means we created parameterized const so that JVM wont provide 
//default const so need to create	
//bcz JVM thinks like u already created a const  even it may be a parameterized  then y i need to create 
	public Student(){
		
	}
	public Student(int a){}
	public void getStudentDetails(){
		System.out.println(StudentId+" "+studentName);
	}
}

public class Constructor_III{
	//we will get same values for every obj creation so for we are creating parameterized const here

	public static void main(String[] args){
		Student obj=new Student(10);
		obj.getStudentDetails();
		Student obj1=new Student();
		obj1.getStudentDetails();
		
	}
}

*/


/*
class Student{
	int StudentId;
	String studentName;
	
	public Student(int id,String name){
		StudentId=id;
		studentName=name;
		
	}
	
	public void getStudentDetails(){
		System.out.println(StudentId+" " +studentName);
	}
}

public class Constructor_III{

	public static void main(String[] args){
		Student obj=new Student(101,"mane");
		System.out.println(obj);//prints package name + class name (techinically called fully qualified name)
		
		obj.getStudentDetails();
		Student obj1=new Student(108,"nat");
		obj1.getStudentDetails();
		
	}
}
*/



/*
class Student{
	int StudentId;
	String studentName;
	
	public Student(int id,String name){
		StudentId=id;
		studentName=name;
		
		
	}
	//tostring will convert the obj into string
	public String toString(){
		return "id: "+ StudentId+"name: "+studentName;
	}
	
	
}

public class Constructor_III{

	public static void main(String[] args){
		Student obj=new Student(101,"mane");
		System.out.println(obj);
		System.out.println(obj.toString());//gives same output only
		Student obj1=new Student(108,"nat");
		
		
	}
}
*/



//by by own home work gave
/*
class Employee{
	int empId;
	String empName;
	String companyName;
	public String toString(){
		return "empid: "+empId+" empName: "+empName+" companyName: "+companyName;
	}
	public Employee(int id,String name,String company){
		empId=id;
		empName=name;
		companyName=company;
		
		
	}
	
}
class Constructor_III{
	public static void main(String[] args){
		Employee e=new Employee(180,"man","bytexl");
		System.out.println(e);
		
		
	}
}
*/

/*
class Employee{
	int empId=101;
	String empName="man";
	String companyName="bytexl";
	public String toString(){
		return "empid: "+empId+" empName: "+empName+" companyName: "+companyName;
	}
	
	
}
class Constructor_III{
	public static void main(String[] args){
		Employee e=new Employee();
		System.out.println(e);
		
		
	}
}
*/




/*
//my own
class Constructor_III{
	String studentid=1010;
	public Constructor_III(){
		System.out.println(studentid);
	}
	public static void main(String[] args){
		Constructor_III obj=new Constructor_III();
		Constructor_III obj1=new Constructor_III();
		//id cant be same 
		//it will give same output so for to change arguments(values) parameterized const imp
		
	}
}
*/
