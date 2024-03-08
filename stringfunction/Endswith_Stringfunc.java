package stringfunction;

public class Endswith_Stringfunc {

	public static void main(String[] args) {
		String name="Orange";
	boolean answer=	name.endsWith("a"); //if condition will be true thenanswer true if condition is false then condition will be alse.
		System.out.println(answer);
		
	String answer1=	name.replace('g', 'A');//replace old char with new char.
     System.out.println(answer1);
     
     String n1="orange fruit";
    String answer2= n1.replaceAll("fruit", "and banana"); //replace all.
     System.out.println(answer2);
     
     String name1="world no 1";//remove the numeric number.
     System.out.println(name1.replaceAll("[0-9]", " "));
     
    System.out.println(name1.replaceAll("[a-z]", ""));
    
    String name2="Sarmila Dhungana";
    System.out.println(name2.replaceAll("[a-z]", ""));//remove all the small letter.
    System.out.println(name2.replaceAll("[A-Z]", "")); //remove all the capital letter.
 
    String name3="Karuna Subedi";
   String answer3= name3.replaceAll("Subedi", "Koirala"); //replace surname with other surname.
     System.out.println(answer3);
     
     String a1="";
     System.out.println(a1.isEmpty());//checking true or false by using empty function
     
     System.out.println(name1.equals(name));
     System.out.println("Sarmila".equals("Sarmila"));//using equal function
     String name4="Ravi Das";
    
     
     
	}
}
