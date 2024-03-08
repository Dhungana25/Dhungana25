package first.project;

public class Method_Overloading {

	 void add() {
		System.out.println("Method1");
	}
	static void add(int a) {
		System.out.println("Method 2");
	}
	static void add(char c,double b, String d) {
		System.out.println("Method 4");
	}
	public static void main(String[] args) {
		Method_Overloading m1=new Method_Overloading();
		m1.add();
	   add(100);
	   add('b',6.82,"Nepal");
	
		

	}

}
