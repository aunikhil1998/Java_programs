package program_day1;

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

	}

}
