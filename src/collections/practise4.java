package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class practise4 {
	public static void main(String[] args) {
		List<Integer> list1=new ArrayList<Integer>();
		list1.add(45);
		list1.add(67);
		list1.add(89);
		list1.add(0);
		list1.add(5);
		list1.add(34);
		list1.add(56);
		list1.add(12);
		list1.add(4);
		list1.add(23);
		System.out.println("List1 : "+list1);
		list1.remove(1);
		System.out.println("List1 : "+list1);
	}

}
