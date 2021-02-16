package methodOverRiddingDemo;

public class SBI extends RBI {

	public static void main(String[] args) {
	
		SBI home = new SBI();		//will get result as 9% because we have made object of child class and hence overridden base class
		home.homeLoanIntRate();

		}

	public void homeLoanIntRate()
	{
		System.out.println("Home loan interest rate is 9%");
	}
	
	}


