package type_casting;
 class Teacher_Class3
 {
	 void add()
	 {
		 System.out.println("Happy");
	 }
 }
 class Mentor_Class3 extends Teacher_Class3{
	 void subtract()
	 {
		 System.out.println("Sad");
	 }
 }
public class Upcasting_Ex3Student3 extends Mentor_Class3{
 void mult()
 {
	 System.out.println("Beautiful");
 }
	public static void main(String[] args) {
	Teacher_Class3 t1= new	Upcasting_Ex3Student3();
	t1.add();
	
	Upcasting_Ex3Student3 s1= (Upcasting_Ex3Student3)t1;//down casting
	s1.add();
	s1.subtract();
	s1.mult();
	}

}
