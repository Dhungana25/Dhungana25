package type_casting;
  class Teacher4
  {
	 static void apple() {
		  System.out.println("Apple");
	  }
  }
  class Mentor4 extends Teacher4{
	  void Ball()
	  {
		  System.out.println("Ball");
	  }
  }
  class Experience_Student extends Mentor4 {
	  void Cat()
	  {
		  System.out.println("Cat");
	  }
  }

public class Upcasting_Ex4student4 extends Experience_Student {
	 static void Dog()
	{
		System.out.println("Dog");
	}

	public static void main(String[] args) {
	
	Mentor4 m1=	new Experience_Student();
	apple();
	m1.Ball();
	Experience_Student e1=new Upcasting_Ex4student4 ();//i have done upcasting to do down casting because with upcasting down casting is not possible
	e1.Ball();
	e1.Cat();
	apple();
	Upcasting_Ex4student4 u1=(Upcasting_Ex4student4)m1;//down casting
	u1.Ball();
	u1.Cat();
	Dog();
	apple();
	}

}
