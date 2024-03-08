package exceptional_handling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception_Scanner {

	public static void main(String[] args) {
		try {
	Scanner s1= new Scanner(System.in);
	int a =s1.nextInt();  //suppose 1st time i will enter 1 then answer wiil be 1
	int c=1/a;    //second time i will enter 0
	System.out.println(c);  //third time i will enter my name sarmila
		}
		catch(ArithmeticException a1)
		{
			System.out.println("Hello");
		}
		catch(InputMismatchException a2)
		{
			System.out.println("Head");
		}

	}

}
