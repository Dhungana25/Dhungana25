package hererical;
//Assignment no 34
class parent{ //Supercalling statement with parametrized super calling
	parent(int a, int b)
	
	{
		System.out.println(a+b);
	}
}

public class Child5 extends parent {
	
	Child5(){
		super(20,40); //for parametarized we need to write super but for non para its optional.
		System.out.println("Child constructor");
	}
	
	public static void main(String[] args) {
		new Child5();
		

	}

}
