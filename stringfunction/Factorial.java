package stringfunction;

import java.util.Scanner;

//Assignments 52 AB batch 39
public class Factorial {

	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter the number");
		int a=s1.nextInt();
		int factorial=1;
		for(int i=a;i>1;i--)
		{
			factorial=factorial*i; 
			}
		System.out.println("Factorial of the number is:"+factorial);
		//if i will enter number 4 in run time it will give the value like 4*3*2*1=24.

	}

}
