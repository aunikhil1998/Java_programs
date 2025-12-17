package program_day1;

public class Remove_special_characters_From_string {

	public static void main(String[] args) {
		String s1="nikhil123au#@!%^";
		String a=s1.replaceAll("[^a-z]", "");
		System.out.println(a);

	}

}
