package first.project;

public class Global_Variable {
      static int age;
      static double salary;
      char gender='m'; // declear and initialization of gender variable with char data type.
      void add()
      {
    	  
      }
      static void subtract() {
    	  int age=90;
    	  System.out.println(age);
      }
	public static void main(String[] args) {
	//System.out.println(age);
    System.out.println(salary);
    Global_Variable g1=new Global_Variable ();
     System.out.println(g1.gender);
     subtract();	
    System.out.println(age); 
    
	}

}
