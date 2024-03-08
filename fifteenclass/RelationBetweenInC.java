package fifteenclass;
//relation between interface and class.
  interface one
  {
	  void add();//create abstract method without writting abstract infront of it.
	  void subtract();
  }
public class RelationBetweenInC implements one{
	void areaofrectangle()//concrete method
	{
		System.out.println(" Print area of trangle");
	}
	void circleofarea()
	{
		System.out.println("Print area of circle");
	}

	public static void main(String[] args) {
		 RelationBetweenInC r1=new  RelationBetweenInC();
		 r1.areaofrectangle();
		 r1.circleofarea();
		 r1.add();
		 r1.subtract();

	}
   public void add() {
	
		System.out.println("The real logic can be here");
	}

	public void subtract() {
		
		System.out.println("The real logic");
	}
}
