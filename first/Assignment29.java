package first.project;
//Assignments 29 Ab batch 39
import java.util.Scanner;

//local variable by using scanner class.
public class Assignment29 {
  static void add()
	{
	  Scanner s1=new Scanner (System.in);
	  int a=s1.nextInt();
	  int b=s1.nextInt();
	  System.out.println(a+b);
		}
  static void sub()
  {
	  Scanner s1=new Scanner (System.in);
	  int a=s1.nextInt();
	  int b=s1.nextInt();
	  System.out.println(a-b);
 
  }
  void multiply() {
	  Scanner s1=new Scanner (System.in);
	  int a=s1.nextInt();
	  int b=s1.nextInt();
	  System.out.println(a*b);

  }
  void division() {
	  Scanner s1=new Scanner (System.in);
	  int a=s1.nextInt();
	  int b=s1.nextInt();
	  System.out.println(a/b);

  }
  void modulas() {
	  Scanner s1=new Scanner (System.in);
	  int a=s1.nextInt();
	  int b=s1.nextInt();
	  System.out.println(a%b);

  }

	public static void main(String[] args) {
		add();
		sub();
		 Assignment29 a1=new  Assignment29();
		 a1.multiply();
		 a1.division();
		 a1.modulas();

	}

}
