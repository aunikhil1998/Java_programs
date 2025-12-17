package program_day1;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class occurence {

	public static void main(String[] args) {
		//count of occurences in a string
		String s="nikhil";
		LinkedHashMap<Character, Integer> map=new LinkedHashMap<Character, Integer>();
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(map.containsKey(ch)) {
				map.put(ch, map.get(ch)+1);
			}
			else {
				map.put(ch, 1);
			}
		}
		
		
		for(char key:map.keySet()) {
			System.out.println(key+" "+map.get(key));
		}
		
		//Remove all occurrences of a specified value in a given array
		int[] a = {2, 2, 3, 4, 2, 6, 8};
		int val=2;
		int k=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]!=val) {
				a[k]=a[i];
				k++;
			}
		}
		System.out.println("output "+k);
		for(int i=0;i<k;i++) {
			System.out.println("remaining numbers "+a[i]);

		}
	}

}
