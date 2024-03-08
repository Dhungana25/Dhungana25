package first.project;
    class Single_Methodparentclass{
    	void multi(int a, int b)
    	{
    		System.out.println(a*b);
    	}
    }
public class Single_LevelInheritance2 extends Single_Methodparentclass {
        void add(int a, int b) {
    	 System.out.println(a+b);  
       }
        void sub(int a, int b) {
    	  System.out.println(a-b); 
       }
	public static void main(String[] args) {
		Single_LevelInheritance2 m1=new Single_LevelInheritance2();
		m1.add(-64, 25);
		m1.sub(74,85);
		m1.multi(12,6);

	}

}
