package collection;

import java.util.LinkedHashSet;

public class Linked_Hashset {

	public static void main(String[] args) {
		LinkedHashSet s1= new LinkedHashSet();
		s1.add(564);
		s1.add(432);
		s1.add("Hello");
		s1.add('K');
		s1.add(56.73);
		s1.add(true);
		s1.add(null);
		System.out.println(s1);
	}

}
