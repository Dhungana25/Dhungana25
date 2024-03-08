package first.project;

public class Operators {
//create 5 extra static method each for +, -, *, /, %.
	static void add() {
	int a=200;
	 int b=500;
	int sum=a+b;
	System.out.println(sum);
	}
	static void subtract() {
		int a=400;
		int b=600;
		int substract=a-b;
		System.out.println(substract);
	}
	
	static void multiply() {
		int a=345;
		int b=654;
		int multiply=b*a;
		System.out.println(multiply);
	}
	
	static void division() {
		int c=5;
		int d=55;
		int division=d/c;
		System.out.println(division);
	}
	
	static void modulas() {
		int e=24;
		int f=54;
		int modulas=f%e;
		System.out.println(modulas);
	}
	public static void main(String[] args) {
		add();		
		subtract();
		multiply();
		division();
		modulas();
	}

}
