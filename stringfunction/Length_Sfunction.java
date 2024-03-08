package stringfunction;

public class Length_Sfunction {

	public static void main(String[] args) {
		 String name="Sarmila Dhungana";
		  int c1= name.length();
		  System.out.println(c1);
		  
		 String c2= name.toUpperCase();
		 System.out.println(c2);
		String c3= name.toLowerCase();
		System.out.println(c3);
		 char s1= name.charAt(3);
		 System.out.println(s1);
		 String name1="   Saru Mehta";//trim function
		 System.out.println(name1);
		String a2= name1.trim();
		System.out.println(a2);
		
		String name4="Sita";
		String surname="Thapa";
		
		 String fullname= name4.concat(surname);
		 System.out.println(fullname);
		String fullname4= name4.concat(" ").concat(surname);
		System.out.println(fullname4);

	}

}
