package first.project;

public class SIB_IIB_Constructor_MainMethod {
      static
      {
    	  System.out.println("SIB");
      }
      SIB_IIB_Constructor_MainMethod()
      {
    	  System.out.println("Constructor");
      }
      {
    	  System.out.println("IIB");
      }
      
	public static void main(String[] args) {
		System.out.println("Main Method");
		new SIB_IIB_Constructor_MainMethod();
       // new SIB_IIB_Constructor_MainMethod();
	}

}
