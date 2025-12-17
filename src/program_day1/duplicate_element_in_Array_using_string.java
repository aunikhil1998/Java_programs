package program_day1;

import java.util.HashSet;

public class duplicate_element_in_Array_using_string {

	public static void main(String[] args) {
		//duplicate element using string
		String a[]= {"java","python","java","c++","ruby","javascript"};
		HashSet<String> set=new HashSet<String>();
		for(String s:a) {
			if(!set.add(s)) {
				System.out.println("duplicate element is " +s);	
		
			}
		}

	}

}
