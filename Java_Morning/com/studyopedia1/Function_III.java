public class Function_III{
	int a=100;
	static int b=200;
	public void fn1(){
		//can use two
		System.out.println(a);
		System.out.println(b);
		
	}
	public static void fn2(){
		System.out.println(b);
		
		//can use only static
		
	}
	public static void main(String[] args){
		Function_III obj=new Function_III();
		System.out.println(obj.a);
		System.out.println(Function_III.b);
		
	}
}


