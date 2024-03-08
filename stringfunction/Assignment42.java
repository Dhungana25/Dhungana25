package stringfunction;

import java.util.Date;

public class Assignment42 {

	public static void main(String[] args) {
		Date d2= new Date();
		System.out.println(d2.getTime());
		Date d3=new Date(d2.getTime()+(1000*60*60*24*10));  //to find future time 
		System.out.println(d3);
		
		//past time
		Date d4=new Date(d2.getTime()-(1000*60*60*24*10)); //to find past time
		System.out.println(d4);

	}

}
