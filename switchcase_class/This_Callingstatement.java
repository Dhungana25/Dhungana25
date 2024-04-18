package switchcase_class;

public class This_Callingstatement {
	This_Callingstatement (float a){
		this(10);
		System.out.println("constructor 1");
		
	}
	This_Callingstatement (int a)
	{ this(43.5,76);
		System.out.println("constructor 2");
	}
		This_Callingstatement (double a,int b)
		{  this("Sarmila");
			System.out.println("constructor 3");
		}
		This_Callingstatement (String a)
		{this('B');
			System.out.println("constructor 4");
		}
		This_Callingstatement (char a)
		{
			System.out.println("constructor 5");
		}
	

	public static void main(String[] args) {
		This_Callingstatement  c1=new This_Callingstatement (23.87f);
		
	}
}
