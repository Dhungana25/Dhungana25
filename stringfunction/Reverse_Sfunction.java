package stringfunction;
//assignment 41
public class Reverse_Sfunction {  //very important for interview

	public static void main(String[] args) {
	String name="orange";//radar
	String reverse="";
	//for(int i=5;i>=0;i--); //we can use both for loop
	for(int i=name.length()-1;i>=0;i--)
	{ 
		char answer=  name.charAt(i);
		reverse=reverse+answer;
		
	    //System.out.println(answer);
		//System.out.print(answer);
	}
	boolean a1=name.equals(reverse);
	System.out.println(a1);
	//System.out.println(reverse);
	if(a1==true)
	{
		System.out.println("the input is palindrome");
	}
	else
	{
		System.out.println("they are not palidrome");
	}

	}

}
