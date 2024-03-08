package stringfunction;
//important for interview.
//Assignments 51
public class String_Space {

	public static void main(String[] args) {
		String name="karuna  mehta";
		char c1[]= name.toCharArray();
		int Count_Of_Space=0;
		for(int i=0;i<name.length();i++)
		{
		boolean answers =	Character.isSpaceChar(c1[i]);
		
		if(answers==true)
		{
			Count_Of_Space++;
			}
		}
		System.out.println("There is a space in the given string" +Count_Of_Space);
	
	}
}
		
	


