package fifteenclass;
 interface two
 {
	void add();
	void subtract();
 }
 interface three extends two//creating the relation between two interface
 {
	void add1();
	void add2();
 }
  public class Child_Classabstract implements three{ //creating a relation between interface and class
	void circle() 
	{
		System.out.println("Print 1");
	}
	static void rectangle()
	{
		System.out.println("Print 2");
	}

	public static void main(String[] args) {
		rectangle();
		Child_Classabstract c1=new Child_Classabstract();
		c1.circle();
		c1.add();
		c1.subtract();
		c1.add1();
		c1.add2();
		}
	
	public void add() {
		
	System.out.println("Print 3");	
	}
	
	public void subtract() {
		
		System.out.println("Print 4");
	}
	
	public void add1() {
	
		System.out.println("Print 5");
	}
	
	public void add2() {
		System.out.println("Print 6");		
	}

}
