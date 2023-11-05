package demo;

import java.util.Arrays;
import java.util.List;

public class dddd {

	
	
	public static void main(String[] args) {
		String[] list=new String[]
				{"akas"	,"kkk","hhsbvf"};
		
		List<String> list2 = Arrays.stream(list).toList();
		System.out.println(list2);
	}
	
}
