package first.project;

//Assignments31 AB batch 39
class Parent_Class
{
	static void mult(int a, int b) {
		System.out.println(a*b);
	}	
}

public class SingleLevelInheritance extends Parent_Class
{
	static void add(int a, int b) {
		System.out.println(a+b);
	}
	static void sub(int a, int b) {
		System.out.println(a-b);
	}

	public static void main(String[] args) {
		add(24,-32);
		sub(18,14);
		mult(8,16);
		
	}

}
