package first.project;
// Assignments 15 /calling non static method inside main method 
public class Non_StaticMethod2 {
	
	void add()
	{
		int a=400;
		int b=500;
		System.out.println(a+b);
	}
	
	void multiply()
	{
		int a=200;
		int b=300;
		System.out.println(a*b);
	}

	public static void main(String[] args) {	
      subtract();
      Non_StaticMethod2 a1=new Non_StaticMethod2(); //to create an object.
      a1.add();
    a1.multiply();
      
	}
	static void subtract()
	{
		int a =200;
		int b=300;
		System.out.println(b-a);
	}
}
