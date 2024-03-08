package stringfunction;
// create an array of length of 3 datatype and add its value in runtime.
import java.util.Scanner;

public class Assignments44 {
	

	public static void main(String[] args) {
	Scanner s1=new Scanner(System.in);
  
	int[] array =new int[3];
	int l=array.length;
	for(int i=0;i<l;i++)
	{
		System.out.println("Enter the value");
		array[i]=s1.nextInt();
		}
	for(int i=0;i<l;i++)
	{
		System.out.println("The value of array is:"+array[i]);
	}
	 
     }

}
