package program_day1;

import java.util.Arrays;

public class dupicate_element_in_array_using_numbers {

	public static void main(String[] args) {
		int a[]= {1,2,3,2,5,6,7,8,5};
		for(int i=0; i<a.length; i++) {
			for(int j=i+1; j<a.length; j++) {
				if(a[i]==a[j]) {
					System.out.println("print duplicate numbers " +a[i]);
				}
			}
		}
		//2nd method
		int[] b= {1,2,3,3,4,5,6,7,7};
		Arrays.sort(b);
		for(int i=0; i<b.length-1; i++) {
			if(b[i]==b[i+1]) {
				System.out.println("print duplicate numbers 2nd method " +b[i]);
			}
		}

	}

}
