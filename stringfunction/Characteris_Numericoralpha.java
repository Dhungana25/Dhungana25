package stringfunction;
 //important for interview
public class Characteris_Numericoralpha {

	public static void main(String[] args) {
	String name="sarmila123";
	char c1[]= name.toCharArray();
	for(int i=0;i<name.length();i++)
	{
	
	boolean answer= Character.isAlphabetic(c1[i]);
	//boolean answer1= Character.isAlphabetic(c1[8]);
	if(answer==true)
	{
		System.out.println("Index position"+i +"is"+"Alphabet");
	}
	else
	{
		System.out.println("Index position"+i +"is"+"Numeric");
	}
	//System.out.println("Index position"+i +"is"+answer);
	//System.out.println(answer1);
	}
	}

}
