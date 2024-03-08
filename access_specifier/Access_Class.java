package access_specifier;

public class Access_Class {
  public static void add()
{
	System.out.println("Apple");
}
   protected static void sub()
 {
	 System.out.println("Ball");
 }
   private void multi()
 {
	 System.out.println("Cat");
 }
   void div()
 {
	 System.out.println("Dog");
 }
	public static void main(String[] args) {
	add();
	sub();
	 Access_Class a1=new  Access_Class ();
	 a1.multi();
	 a1.div();

	}
}
