package first.project;

import java.util.Scanner;

public class Assignments30_Square {
	static void AreaOfSquare()
	{
		Scanner s1=new Scanner(System.in);
		{
			int side=s1.nextInt();
			int AreaOfSquare = side*side; 
			System.out.println(AreaOfSquare);
		}
	}
	static void CircumferenceOfSquare()
	{
		Scanner s1=new Scanner(System.in);
		{
			int side=s1.nextInt();
			int CircumferenceOfSquare=4*side;
			System.out.println(CircumferenceOfSquare);
		}
	}

	public static void main(String[] args) {
		AreaOfSquare();
		CircumferenceOfSquare();
	}

}
