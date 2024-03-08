package type_casting;
 class Super_Class
 {
	 void add()
	 {
		 System.out.println("Flower");
	 }
 }

public class Upcasting_Class extends Super_Class{
	void subtract()
	{
		System.out.println("Sun flower");
	}

	public static void main(String[] args) {
		
	Super_Class p1=	new Upcasting_Class();//upcasting converting child class object in super class.
	p1.add();
	//p1.subtract(); once upcasting is done we cannot utilized child class method
	
	}

}
