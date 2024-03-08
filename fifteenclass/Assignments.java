package fifteenclass;
//Assignments 39 AB batch 39 by sarmila.
 //create 4 parent class and create the relation with child class
  interface Parent3 // parent n parent never have a relation between each other.
  {
	  void add();
  }
  interface Parent4
  {
	  void sub();
  }
  interface Parent5
  {
	  void mult();
  }
  
  interface Parent6
  {
	  void div();
  }
  public class Assignments implements Parent3,Parent4,Parent5,Parent6 {
	public static void main(String[] args) {
		 Assignments a1=new  Assignments();
		 a1.add();
		 a1.sub();
		 a1.div();
		 a1.mult();
	}
	public void div() {
		
	System.out.println("cow");	
	}


	public void mult() {
		System.out.println("cat");
		
	}


	public void sub() {
		System.out.println("ball");		
	}

	
	public void add() {
	System.out.println("apple");	

	}
	}

	
	

	


		
	

	
		
	


