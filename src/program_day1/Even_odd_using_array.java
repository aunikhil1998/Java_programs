package program_day1;

public class Even_odd_using_array {

	public static void main(String[] args) {
		int a[]= {2,3,4,1,6,7,8};
		for(int i=0; i<a.length; i++) {
			if(a[i]%2==0) {
				System.out.println("Print only even " + a[i]);
			}
			else {
				System.out.println("Print only odd " + a[i]);
			}
			
		}
		

	}

}
