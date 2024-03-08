package type_casting;
class Parent_Class
{
	 void add()
	 {
		 System.out.println("Flower");
	 }
}

public class Down_Casting extends Parent_Class{
	void sub()
	{
		System.out.println("Sweet");
	}

	public static void main(String[] args) {
	
	Parent_Class p1 = new Down_Casting();
	p1.add();
	Down_Casting d1=(Down_Casting )p1;
	d1.add();
	d1.sub();
	}

}
