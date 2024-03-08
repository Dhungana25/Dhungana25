package fifteenclass;
 interface Parent1 //important for interview
 {
	void auth();
	void authentication();
 }
 interface Parent2 //we dont have the realtion between two parentclass in multiple level inheritance.
 {
	 void username();
	 void password();
 } //multiple level inhertance
public class Multiplelevel implements Parent1,Parent2 {

	public static void main(String[] args) {
		Multiplelevel m1= new Multiplelevel();
		m1.auth();
		m1.authentication();
		m1.username();
		m1.password();

	}
    public void username() {
	System.out.println("Method 2");			
	}


	public void password() {
		
	System.out.println("Method 1");	
	}

	
	public void auth() {
		System.out.println("Method 3");		
	}

	
	public void authentication() {
		System.out.println("Method 4");		
	}

}
