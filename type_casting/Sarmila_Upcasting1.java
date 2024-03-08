package type_casting;
 class Object_Class
 {
	 void multiply()
	 {
		 System.out.println("upcasting child class into object class");
	 }
 }

public class Sarmila_Upcasting1 extends Object_Class{
	void divsion()
	{
		System.out.println("Child class");
	}

	public static void main(String[] args) {
		
		Object_Class c1 = new Sarmila_Upcasting1 ();
		c1.multiply();
		
	}

}
