package type_casting;
 class Teacher_Class{
	 void add()
	 {
		 System.out.println("cow");
	 }
 }
 class Mentor_Class extends Teacher_Class{
 
	 void sub()
	 {
		 System.out.println("Dog");
	 }
 }
public class Upcasting_Eg2student extends Mentor_Class {
	void multiply()
	{
		System.out.println("Fish");
	}

	public static void main(String[] args) {
	Mentor_Class m1	=new  Upcasting_Eg2student();
	m1.add();
	m1.sub();
	Upcasting_Eg2student s1=(Upcasting_Eg2student)m1;  //down casting
	s1.add();
	s1.sub();
	

	}

}
