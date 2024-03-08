package type_casting;

public class Primitive_Narrowing {

	public static void main(String[] args) {
		int a=(int) 86.98;  //converting double into int data type.
		System.out.println(a);
		
		double pi=3.14;
		int newpi=(int) pi; //explicty manner.
		System.out.println(newpi);

	}

}
