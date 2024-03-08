package first.project;
//Assignments 22
public class AreaAndCircumferenceOf_Trapezium {
  static int a=4;
  static int b=6;
  static int c=8;
  static int d=5;
  static int h=10;
  
	public static void main(String[] args) {
	int AreaOfTrapezium = (a+b)*h/2;
	System.out.println(AreaOfTrapezium );
	
	int CircumferenceOfTrapezium = a*b+b*c+c*d+a*d;
	System.out.println(CircumferenceOfTrapezium);

	}

}
