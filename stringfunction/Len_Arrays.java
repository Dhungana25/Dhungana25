package stringfunction;

public class Len_Arrays {

	public static void main(String[] args) {
		int number[]=new int[4];
		number[0]=121;
		number[1]=34;
		number[2]=423;
		int no_to_check=34;
		for(int i=0;i<=2;i++)
		{
			if(no_to_check==number[i])
			{
				System.out.println("I found the number");
			}
		}
	
		}

}
