package JavaBasic;

public class Oop {
	//Global variable		class variable
	int age=22;
	String name="pawan";
	
	public static void main(String[] args) {
		Oop obj=new Oop();

		System.out.println(obj.age + obj.name);
		
		// TODO Auto-generated method stub
		//object will be created obj is reference variable referring to this object
		//after creating object copy of all this non static method will be given to this object
		obj.add();
		
	int division	=obj.div();
		System.out.println(obj.div());
		System.out.println(division);
		
		int mulitplication=obj.mul(2, 9);
		System.out.println(mulitplication);
		String empName=obj.names("pawan");
		System.out.println(empName);
		

	}
	
	
	
	public void add() {
		int a=12;
		int b=23;
		int c=a + b;
		System.out.println(c);
		System.out.println(age);
	}

	public int div() {
		int a=12;
		int b=4;
		int c=a/b;
		return c;
	}
	
	public int mul(int x, int y) {
		int z=x * y;
		return z;
	}
	
	public String names(String name) {
		
		return name;
	}
}
