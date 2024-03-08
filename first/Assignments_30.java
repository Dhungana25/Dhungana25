package first.project;

import java.util.Scanner;

public class Assignments_30 {
 final static double pi=3.14;
 static void AreaofCircle()
 {
	 Scanner s1=new Scanner(System.in);
	 { double r=s1.nextDouble();
	 double AreaofCircle=pi*r*r;
		System.out.println(AreaofCircle); 
	 }
 }
	static void Circumference_Circle()
	 {
		 Scanner s1=new Scanner(System.in);
		 {
		double r=s1.nextDouble();
		 double Circumference_Circle = 2*pi*r;
			System.out.println(Circumference_Circle ); 
		 }
	 }
 
	public static void main(String[] args) {
		 AreaofCircle();	
		 Circumference_Circle();

	}

}
