package Oops_concept;

public class exception_handling {

	public static void main(String[] args) {
		try {
			int a=10;
			int b=0;
			int c=a/b;
			System.out.println("result: "+c);
		}catch(ArithmeticException e){
			System.out.println("exception catched value canot be divided by zero");
		}finally {
			System.out.println("program ended safely");

		}

	}

}
