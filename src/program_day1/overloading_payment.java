package program_day1;


public class overloading_payment {
	void pay(int amount) {
		System.out.println("paying cash "+amount);
	}
	void pay(int amount, String cardnumber) {
		System.out.println("paying using card "+amount+" "+cardnumber);
	}
	void pay(int amount, String upi, boolean isupi) {
		System.out.println("paying using upi "+amount+" "+upi+" "+isupi);
	}
	
	public static void main(String[] args) {
		overloading_payment p=new overloading_payment();
		p.pay(200);
		p.pay(500, "1223456789");
		p.pay(700, "abc@upi", true);

	}

}
