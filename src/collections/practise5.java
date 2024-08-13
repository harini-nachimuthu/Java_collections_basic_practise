package collections;

import java.util.LinkedList;
import java.util.List;
import java.util.Collections;

public class practise5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] str1= {"Guvi","geeks","learning","Platform"};
		List<String> strlist=new LinkedList<String>();
		Collections.addAll(strlist,str1);
		System.out.println("strlist : "+strlist);
		int size=strlist.size();
		System.out.println("size : "+size);
		
		
	}

}
