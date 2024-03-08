package first.project;

import java.util.Scanner;

public class Assignments30_Trapizum {
	static void AreaOfTrapizum()
	{  Scanner s1=new Scanner(System.in);
	{ 
		int a=s1.nextInt();
		int b=s1.nextInt();
		int h=s1.nextInt();
	int	AreaOfTrapizum=(a+b)*h/2;
	System.out.println(AreaOfTrapizum);
	}
		
	}
	static void CircumferenceOfTrapizum()
	{
		Scanner s1=new Scanner(System.in);
		{
			int a=s1.nextInt();
			int b=s1.nextInt();
			int c=s1.nextInt();
			int d=s1.nextInt();
			int CircumferenceOfTrapizum=a*b+b*c+c*d+a*d;
			System.out.println(CircumferenceOfTrapizum);
		}
	}
	public static void main(String[] args) {
		AreaOfTrapizum();
		CircumferenceOfTrapizum();
	}

}
