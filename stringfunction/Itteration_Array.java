package stringfunction;
//Assignments50
import java.util.Arrays;

public class Itteration_Array {

	public static void main(String[] args) {
		int array1[]=new int[4];
		array1[0]=23;
		array1[1]=45;
		array1[2]=65;
		array1[3]=56;
		int array2[]=new int[array1.length];
		for(int i=0;i<4;i++)
		{
		array2[i]    = array1[i];
		}
		System.out.println(Arrays.toString(array2));
		System.out.println(Arrays.toString(array1));
		
	}

}
