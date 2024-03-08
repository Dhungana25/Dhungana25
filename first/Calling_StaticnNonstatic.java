package first.project;
//Assignments 17 calling static non static and constructor
public class Calling_StaticnNonstatic {
	static void add() {
	int a=100;
	int b=200;
	System.out.println(a+b);
	}
	static void multiply() {
		int a=300;
		int b=400;
		System.out.println(a*b);
	}
	void subtract() {
	int a=400;
	int b=600;
	System.out.println(b-a);
	}
	void division() {
		int a=40;
		int b=4;
		System.out.println(a/b);
	}
	Calling_StaticnNonstatic (){
	System.out.println("Good morning");
	}
	
	public static void main(String[] args) {
		Calling_StaticnNonstatic a1= new Calling_StaticnNonstatic();
		a1.subtract();
		a1.division();
		multiply();
		add();
		
	}
	

}
