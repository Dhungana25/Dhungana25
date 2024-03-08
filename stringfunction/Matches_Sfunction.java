package stringfunction;

public class Matches_Sfunction {

	public static void main(String[] args) {
    String s1="sarmila dhungana";
    boolean a1=s1.contains("dhungana");  //char sequence is string
    System.out.println(a1);
    
    String s2="orange";
    boolean a2=s2.matches("o....");
    System.out.println(a2);
       boolean a3= s1.matches("(.*)n"); //string name end with
       System.out.println(a3);
       boolean a4= s1.matches("s(.*)"); //string name start with s
     System.out.println(a4);
     
     String name="sita";
     boolean a5= name.matches("....");
     System.out.println(a5);
     
	}

}
