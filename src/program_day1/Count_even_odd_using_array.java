package program_day1;

public class Count_even_odd_using_array {

	public static void main(String[] args) {
		
		//count of even and odd
		int a[]= {1,2,3,4,5};
		int even=0; int odd=0;
		for(int i=0; i<a.length; i++) {
			if(a[i]%2==0)
				even++;
		}
			System.out.println("count of even " + even);
			
			for(int i=0; i<a.length; i++) {
				if(a[i]%2!=0)
					odd++;
			}
			
			System.out.println("count of odd " + odd);
		
		
			//count of given number
		int num=12345928;
		int count=0;
		while(num!=0) {
			num=num/10;
			count++;
		}
		System.out.println("count of numbers " + count);

		}
}
