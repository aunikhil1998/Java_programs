package program_day1;

public class swapping_numbers {

	public static void main(String[] args) {
		//using third variable
		int a=10; 
		int b=20;
		System.out.println("before swapping " +a+" "+b);
		int t=a; a=b; b=t;
		System.out.println("After swapping " +a+" "+b);
		
		//without using third variable
		int c=30; 
		int d=40;
		System.out.println("before swapping " +c+" "+d);
		 c=c+d; //30 
		 d=c-d; //10
		 c=c-d; //20
		 System.out.println("After swapping " +c+" "+d);
		
	}

}
