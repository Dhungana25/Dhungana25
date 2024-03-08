package first.project;
 //Child class
public class Single_LevelInherita3 extends Single_LevelInherat4{
   void multi() {
	 System.out.println("method 1");  
   }
   void division() {
	   System.out.println("Method5");
   }
	public static void main(String[] args) {
		add();
		Single_LevelInherita3 s1=new Single_LevelInherita3 ();
		s1.sub();
		s1.multi();
		s1.division();
      
	}

}
