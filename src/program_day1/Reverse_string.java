
package program_day1;

public class Reverse_string {

	public static void main(String[] args) {
		//1st method
		String s="mom";
		String rev="";
		for(int i=s.length()-1; i>=0; i--) {
			rev=rev+s.charAt(i);
		}
		if(s.equals(rev)) {
			System.out.println("Given string is palindrome ");
		}
		else {
			System.out.println("Given string is not a palindrome ");

		}
		
		//2nd method
		String s1="nikhil";
		StringBuilder sb=new StringBuilder(s1);
		sb.reverse();
		System.out.println("Revrese the string "+sb);

	}

}
