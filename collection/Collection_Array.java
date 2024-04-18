package collection;

import java.util.ArrayList;
import java.util.Collections;

public class Collection_Array {

	public static void main(String[] args) {
		ArrayList a1= new ArrayList();
		a1.add(100);
		a1.add(560);
		a1.add(690);
		a1.add("Sarmila");
		a1.add(false);
		a1.add('S');
		a1.add(3.43);
		a1.add(null);
		
		System.out.println(a1);
		
		ArrayList a2= new ArrayList();
		a2.add(100);
		a2.add(560);
		a2.add(690);
		a2.add(876);
		a2.add(980);
		a2.add(87);
		a2.add(367);
		a2.add(54);
		Collections.sort(a2);
		System.out.println(a2);
	}

}
