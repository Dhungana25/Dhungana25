package exceptional_handling;

import java.util.InputMismatchException;

public class Exceptional1 {

	public static void main(String[] args) {
	
	try {
	int b=1/0; //this line has a exception because of that catch block will execute.
	System.out.println(b);
	}
	catch(ArithmeticException a1)
	{
	System.out.println("Green");	
	}
	catch(InputMismatchException a2)
	{
		System.out.println("Blue");
	}
	}

}

