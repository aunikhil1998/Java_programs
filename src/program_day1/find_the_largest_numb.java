package program_day1;

import java.util.Scanner;

public class find_the_largest_numb {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("find the first largest number: ");
		int a=sc.nextInt();
		
		System.out.println("find the second largest number: ");
		int b=sc.nextInt();
		
		System.out.println("find the third largest number: ");
		int c=sc.nextInt();
		
		if(a>b && a>c) {
			System.out.println("largest number is: " +a);
		}
		else if(b>a && b>c) {
			System.out.println("largest number is: " +b);
		}
		else{
			System.out.println("largest number is: " +c);
		}
	}

}

