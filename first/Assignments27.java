package first.project;  //global variables

import java.util.Scanner;

public class Assignments27 {
	static int no1;
	static int no2;
	static void add() {
		System.out.println(no1+no2);
	}
     static void subtract() {
    	 System.out.println(no1-no2);
     }
     static void multiply() {
    	 System.out.println(no1*no2);
     }
     static void division() {
    	 System.out.println(no2/no1);
     }
     static void modulas() {
    	 System.out.println(no2%no1);
     }
	public static void main(String[] args) {
	Scanner s1= new Scanner(System.in);	
	    no1= s1.nextInt();
	    no2 = s1.nextInt();
      add();
      subtract();
      multiply();
      division();
      modulas();     
	}

}
