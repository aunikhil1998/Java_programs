package program_day1;

public class Maximum_minimum_numbers {

	public static void main(String[] args) {
		//maximum value
		int a[]= {45,10,80,900,100};
		int max=a[0];
		for(int i=1;i<a.length;i++) {
			if(a[i]>max) {
				max=a[i];
			}
		}
		System.out.println("maximum value is " + max);
		
		//minimum value
		int b[]= {40,10,80,98,100};
		int min=b[0];
		for(int i=1;i<b.length;i++) {
			if(b[i]<min) {
				min=b[i];
			}
		}
		System.out.println("minimum value is " + min);
		
		
	}

}
