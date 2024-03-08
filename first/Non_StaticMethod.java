package first.project;

public class Non_StaticMethod {

	void add()
	{
		int a=100;
		int b=200;
		System.out.println(a+b);
	}
	public static void main(String[] args) {
		System.out.println("Started");
		Non_StaticMethod a1=new Non_StaticMethod(); //this is how we create and object.
		a1.add(); //calling non static method 

	}

}
