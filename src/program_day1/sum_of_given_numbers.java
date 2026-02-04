package program_day1;

import java.lang.reflect.Array;
import java.util.Arrays;

public class sum_of_given_numbers {

	public static void main(String[] args) {
		int no=2567;
		int sum=0;
		while(no!=0) {
			int rem=no%10;
			sum=sum+rem;
			no=no/10;
		}
		System.out.println("Sum of given digit is: " +sum);
		
		//2nd method
		int[] num= {1,2,3,4,5};
		Arrays.sort(num);
		int Sum=0;
		for(int a:num) {
			if(a%2==0) {
				Sum=Sum+a;
			}
		}
		System.out.println("Sum of given digit is: " +Sum);
	}

}
