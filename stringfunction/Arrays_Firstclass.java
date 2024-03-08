package stringfunction;

import java.util.Arrays;

public class Arrays_Firstclass {

	public static void main(String[] args) {
		int age[]=new int[3];
		age[0]=80;
		age[1]=30;
		age[2]=60;
		age[2]=102; //update the value of your any index in array.
		//age[3]=19; (java.lang.ArrayIndexOutOfBoundsException)
		Arrays.sort(age);  //sorted from lower to higher value
		System.out.println(Arrays.toString(age)); //we can print in this manner also
		
		/*for(int i=0;i<=2;i++)
		{
			System.out.println(age[i]);
		}
		/*System.out.println(age[0]);
		System.out.println(age[1]);
		System.out.println(age[2]);
*/
	}

}
