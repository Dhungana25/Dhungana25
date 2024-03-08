package type_casting;

public class Primitive_Widening {

	public static void main(String[] args) {
		
		double weight=52;//widening(we have converted int data type into double data type)implicit way
		System.out.println(weight); 
		
		weight=98.56;
		//widning can be done in two ways implicit and explicit way
		
		double weight1=(double)90;//widning in explicit way
		System.out.println(weight1);
		
		//
		byte a1=80;
		//if we change byte into int it is widening.
		int a2=a1;
		System.out.println(a2);
		
		
	}

}
