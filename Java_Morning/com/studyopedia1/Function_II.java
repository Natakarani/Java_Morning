public class Function_II{
	public boolean isEven(int num){
		if(num%2==0){
			return true;
		}
		else{
			return false;
		}
		
	}
	public static void doSomething(){
		System.out.println("hello");
	}
	public void greet(){
			System.out.println("GOOD EVENING");
			
		}
		
		public int getData(){
			return 100;
		}
		
		public String getMsg(String name){
			return "GOOD EVENING: "+name;
		}
	public static void main(String[] args){
		System.out.println("functions");
		Function_II obj=new Function_II();
		obj.greet();
		int box=obj.getData();
		System.out.println(box);
		String box2=obj.getMsg("maneesha");
		System.out.println(box2);
		
		System.out.println(obj.isEven(12));
		Function_II.doSomething();
		
		
		
	}
}



