package stringfunction;
//Assignments 55
public class Sun_Moon {

	public static void main(String[] args) {
		for(int i=1;i<=1000;i++)
		{
			if(i%3==0)
			{
				System.out.println("sun");
			}
			if(i%5==0)
			{
				System.out.println("moon");
			}
			if(i%3==0&i%5==0)
			{
				System.out.println("Sun and Moon");
			}
		}
		
	}

}
