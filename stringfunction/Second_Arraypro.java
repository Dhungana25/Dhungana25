package stringfunction;

import java.util.Arrays;

public class Second_Arraypro {

	public static void main(String[] args) {
		String name[]=new String[5];
		name[0]="sita";
		name[1]="gita";
		name[2]="sia";
		name[3]="ram";
		
         Arrays.sort(name);
         System.out.println(Arrays.toString(name));//we can print in both manner
		
		/*for(int i=0;i<=4;i++)//we can print in both manner
		{
		System.out.println(name[i]);
		}*/
	}

}
