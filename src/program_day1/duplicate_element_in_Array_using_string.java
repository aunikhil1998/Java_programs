package program_day1;

import java.util.HashSet;

public class duplicate_element_in_Array_using_string {

	public static void main(String[] args) {
		//duplicate element using string
		String a[]= {"N","i","k","h","i","l"};
		HashSet<String> langs=new HashSet<String>();
		for(String l:a) {
			if(langs.add(l)==false) {
				System.out.println("duplicate element is " +l);	
		
			}
		}

	}

}
