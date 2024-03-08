package stringfunction;

public class Isspace_Array {

	public static void main(String[] args) {
		String name="sarmila dhungana";
		char[] c1=name.toCharArray();
		for (int i=0;i<name.length();i++)
		{
		boolean answer=Character.isSpaceChar(c1[i]);
       // System.out.println(answer);
		if(answer==true) {
			System.out.println("Their is a space in the given string"+"The index of space is ");
		}
		}
		
	}

}
