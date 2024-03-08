package exceptional_handling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Finallyblock {

	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		try {
		int number = s1.nextInt();
		}
		catch (InputMismatchException a1)
		{
			System.out.println("Hey exception come but dont worry i will handle it");
			}
		finally   //finally block will always execute.
		{
			System.out.println("I will always execute");
		}

	}

}
