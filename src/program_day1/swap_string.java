package program_day1;

public class swap_string {

	public static void main(String[] args) {
		//1st method
		String input = "nikhil.annigere";
		String[] part = input.split("\\.");
		StringBuilder reversed=new StringBuilder();
		for(int i=part.length-1; i>=0; i--) {
			reversed.append(part[i]);
			if(i!=0) {
				reversed.append(".");
			}
		}
		System.out.println("input " +input);
			System.out.println("output " +reversed.toString());
			
			
			//2nd method
		String st = "nikhil annigere";
		String[] word = st.split(" ");
		if(word.length==2) {
			String output=word[1] +" "+ word[0];
			System.out.println("output " + output);

		}


	}
}
