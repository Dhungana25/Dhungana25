package stringfunction;

public class Average_Arraylength {

	public static void main(String[] args) {
		int array[]= new int[5];
		array[0]=32;
		array[1]=42;
		array[2]=54;
		array[3]=87;
		array[4]=64;
		/*double average= (array[0]+array[1]+array[2]+array[3]+array[4])/array.length;
		System.out.println(average);
		*/
		double sumofnumber=0;//we can write sum of number
		for(int i=0;i<=4;i++)
		{
			sumofnumber=sumofnumber+array[i];
			
		}
		System.out.println(sumofnumber);
		double average =sumofnumber/array.length;
		System.out.println("Average is:"+average);

	}

}
