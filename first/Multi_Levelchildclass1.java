package first.project;
//Assignments 32 AB batch 39
public class Multi_Levelchildclass1 extends Multi_Levelparentclass2  {
	void add() {
		System.out.println("Child class");
	}
	
public static void main(String[] args) {
	mult();
	Multi_Levelchildclass1 m1= new Multi_Levelchildclass1 ();
	m1.add();
	m1.sub();
	m1.div();
	
	
}

}

