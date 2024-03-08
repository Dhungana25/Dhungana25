package fifteenclass;
class G_Parent //super calling statement with parametarized
{
	G_Parent(int a, double b) //Important for interview
	{
		System.out.println("Grand parent constructor");
	}
}
class Parent extends G_Parent
{
	Parent(String a)
	{super(23,23.4);
		System.out.println("Parent constructor");
	}
}

public class Sarmila extends Parent{
	Sarmila()
	{super("Sita");
		System.out.println("Child constructor");
	}

	public static void main(String[] args) {
	
new Sarmila();

	}

}
