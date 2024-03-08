package first.project;

import java.util.Scanner;

public class Assignment30_Rectangle {
	static void AreaOfRectangle()
	{
		Scanner s1=new Scanner(System.in);
		{
			int length=s1.nextInt();
			int width=s1.nextInt();
			int AreaOfRectangle=length*width;
			System.out.println(AreaOfRectangle);
		}
	}
	static void CircumferenceOfRectangle()
	{
		Scanner s1=new Scanner(System.in);
		{
			int length=s1.nextInt();
			int width=s1.nextInt();
			int CircumferenceOfRectangle=2*length+2*width;
			System.out.println(CircumferenceOfRectangle);
		}
	}

	public static void main(String[] args) {
		AreaOfRectangle();
		CircumferenceOfRectangle();
		
	}

}
