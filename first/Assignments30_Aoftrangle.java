package first.project;

import java.util.Scanner;

public class Assignments30_Aoftrangle {
	
	static void AreaOfTrangle()
	{
		Scanner s1=new Scanner(System.in);
		{
		int b=s1.nextInt();
		int h=s1.nextInt();
		int AreaOfTrangle=b*h/2;
		System.out.println(AreaOfTrangle);
	}
	}
	static void CircumferenceOfCircle()
	{
		Scanner s1=new Scanner(System.in);
		{
			int a=s1.nextInt();
			int b=s1.nextInt();
			int c=s1.nextInt();
			int CircumferenceOfCircle=a+b+c;
			System.out.println(CircumferenceOfCircle);
			}	
	}

	public static void main(String[] args) {
		AreaOfTrangle();
		CircumferenceOfCircle();
	}

}
