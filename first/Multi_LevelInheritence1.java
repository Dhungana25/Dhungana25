package first.project;
class Sarmila{
void add() {
	System.out.println("add 2 no.s");
}
void sub() {
	System.out.println("sub 2 no.s");
}
}
class Parent extends Sarmila{
void mult() {
	System.out.println("mul 2 no.s");
}
void div() {
	System.out.println("div 2 no.s");
}
}
public class Multi_LevelInheritence1 extends Parent {
	void mod() {
		System.out.println("mod 2 no.s");
	}

	public static void main(String[] args) {
		 Multi_LevelInheritence1 m1=new  Multi_LevelInheritence1();
		 m1.add();
		 m1.sub();
		 m1.mult();
		 m1.div();
		 m1.mod();

	}

}
