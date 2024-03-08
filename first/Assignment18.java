package first.project;

public class Assignment18 {

	 static void add() {
		System.out.println("Method1");
	}
	static void add(int a) {
		System.out.println("Method 2");
	}
	static void add(char c,double b, String d) {
		System.out.println("Method 4");
	}
	static void add(double a,boolean b) {
		System.out.println("Method 5");
	}
	void add(float a) {
		
		System.out.println("Method 6");
	}
	void add(int d,String e) {
		System.out.println("Method 7");
	}
	void add(boolean b) {
		System.out.println("method 8");
	}
	void add(char c,double d) {
		System.out.println("Method 9");
	}
	public static void main(String[] args) {
		add();
	   add(100);
	   add('b',6.82,"Nepal");
	   add(5.76, true);
	   Assignment18 a1=new Assignment18();
	   a1.add(877.9f);
	   a1.add(24,"Red");
	   a1.add(false);
	   a1.add('b',8.9);

	}

}
