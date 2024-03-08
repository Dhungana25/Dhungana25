package fifteenclass;
//Assignments37 Ab batch39
 abstract class Parent_Class  //exposing purpose
{
	 abstract void add(); //abstract method will always be non-static
	 abstract void subtract();
	 void mult()  //concrete methods can be static n non static
	 {
		System.out.println("It is a logiv which i m exposing"); 
	 }
	 static void modulas()  //concrete methods
	 {
		 System.out.println("It is a logic which i m exposing"); 
	 }
}
public class Abstract_Childclass extends Parent_Class{ //concrete class
	
  void add() //concrete method
	{
	System.out.println("Real logic");
	}

	public static void main(String[] args) {  //concrete method
		
		Abstract_Childclass a1=new Abstract_Childclass ();
		a1.add();
		a1.subtract();
		a1.mult();
		modulas();
		
		}
    void subtract() {
	System.out.println("Internal logic subtraction");
		
	}
}
