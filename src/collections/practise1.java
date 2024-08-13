package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
//import java.util.*;

public class practise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] str= {"abc","def","ghi","jkl","mno","pqrst"};
		List<String> list1=new ArrayList<String>();
		Collections.addAll(list1,str);
		System.out.print(list1);

	}

}
