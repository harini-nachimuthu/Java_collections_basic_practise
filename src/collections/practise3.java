package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class practise3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		System.out.println("list1 values :: "+list1);
		int sise=list1.size();
		boolean emp=list1.isEmpty();
		System.out.println("size : "+sise+" empty : "+emp);
		list1.clear();
		int sise1=list1.size();
		boolean emp1=list1.isEmpty();
		System.out.println("size : "+sise1+" empty : "+emp1);
		
		
	}

}
