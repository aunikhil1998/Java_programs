package program_day1;

public class interview_que {

	public static void main(String[] args) {
		int[] arr= {10,20,25,30,15};
		int max=arr[0];
		int min=arr[0];
		for(int num:arr) {
			if(num>max) {
				max=num;
			}
			if(num<min) {
				min=num;
			}
		}
		int op=max+min;
		System.out.println(op);
	}

}
