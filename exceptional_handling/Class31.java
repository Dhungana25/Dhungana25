package exceptional_handling;

import java.util.Scanner;

public class Class31 {

	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		int a=s1.nextInt();
		int age[]=new int[3];
		age[0]=12;
		age[1]=15;
		age[2]=26;
		try {
		age[3]=34;
		}
		
		catch(ArrayIndexOutOfBoundsException d1)
		{
			System.out.println("print the number");
		}
		System.out.println("Manish is very good teacher");
		
	}

}
