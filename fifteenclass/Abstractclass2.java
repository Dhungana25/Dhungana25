package fifteenclass;
abstract class Third_Class //abstract class

{  abstract void thirdmethod(); //abstract method we dont have a body.
 abstract void fourthmethod();
 void add1()  //concrete method
 {
	  System.out.println("addition 1 ");
 }
static void add2()
 {
	  System.out.println("addition 2");
 }	
}
 abstract class Second_Class extends Third_Class {
	  abstract void secondmethod();
	  abstract void second_method();
	void subtraction()
	{
		System.out.println("subtract");
	}
	void multiplication()
	{
		System.out.println("multiply");
	}
 }
	
public class Abstractclass2 extends Second_Class {//concrete class
	void subtraction2()
	{
		System.out.println("Subtract2");
	}
	void multi()
	{
		System.out.println("Multiplication4");
	}
	
	void secondmethod() {
		System.out.println("Developer will write here internal logic");
		
	}
	
	void second_method() {
		System.out.println("Developer will write here internal logic");
		
	}
	
	void thirdmethod() {
		System.out.println("Developer will write here internal logic");
		
	}
	
	void fourthmethod() {
		
		System.out.println("Developer will write here internal logic");
	}


	public static void main(String[] args) {
     add2();
     Abstractclass2 a1=new Abstractclass2();
     a1.add1();
     a1.subtraction();
     a1.multiplication();
     a1.subtraction2();
     a1.multi();
     a1.second_method();
     a1.second_method();
     a1.thirdmethod();
     a1.fourthmethod();
    
	}

}
