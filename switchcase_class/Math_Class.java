package switchcase_class;

public class Math_Class {

	public static void main(String[] args) {
  double pi=Math.PI;  // no need to provide the value of pi we can write math.pi
	int r=7;
	System.out.println(pi*r*r);
  System.out.println(Math.addExact(234, 431));
  System.out.println(Math.subtractExact(56, 45));
  System.out.println(Math.multiplyExact(4, 8));
  System.out.println(Math.sqrt(100));
  System.out.println(Math.min(55, 85));
  System.out.println(Math.max(73, 89));
  for(int i=1;i<100;i++)
  {
  System.out.println(Math.random());
	}
	}
}
