package fifteenclass;//Important for interview
//Assignments 35 method overriding
 class College_Class
{  void bookstowrite() //method name have to be same than only we can over ride.
	{
	   System.out.println("Writting to study");
	}	
}
   public class Method_Overridding extends College_Class {
	void bookstowrite()
	{  super.bookstowrite(); //super keyword applicable for nonstatic method it can be any line
		System.out.println("Writting for practice");
		}

	public static void main(String[] args) {
		Method_Overridding m1=new Method_Overridding ();
		m1.bookstowrite();
		//m1.bookstowrite();
	}

}
