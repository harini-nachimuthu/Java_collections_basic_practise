package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class practise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list1=new ArrayList<Integer>();
		list1.add(3);
		list1.add(5);
		list1.add(14);
		list1.add(6);
		list1.add(8);
		int min=Collections.min(list1);
		int max=Collections.max(list1);
		if(min==max) {
			System.out.println(min+" and "+max+" values are equal .. ");
		}
		else {
			System.out.println (min+" and "+max+" values are min and max value .. ");
		}
		
	}

}
