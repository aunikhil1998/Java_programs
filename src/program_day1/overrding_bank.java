package program_day1;

public class overrding_bank {

	double getInterestRate() {
        return 5.0;
	}
}
class SBI extends overrding_bank {
    
    double getInterestRate() {
        return 6.5;
    }
}

class HDFC extends overrding_bank {
    
    double getInterestRate() {
        return 7.0;
    }
}

class main{
	public static void main(String[] args) {
		overrding_bank bank;
		bank=new SBI();
		System.out.println("intrest rate of sbi bank:" +bank.getInterestRate());
	}
}