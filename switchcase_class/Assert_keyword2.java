package switchcase_class;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Assert_keyword2 {

	public static void main(String[] args) {
		int age[]=new int[3];
		age[0]=12;
		age[1]=13;
		age[2]=14;
		
		
		int ageofparents[]=new int[3];
		ageofparents[0]=76;
		ageofparents[1]=18;
		ageofparents[2]=65;
		assert Array.getLength(age)>13;
		boolean answer= Arrays.equals(age, ageofparents);
		System.out.println(answer);
		
		

	}

}
