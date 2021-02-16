package methodOverRiddingDemo;

public class SBIwithInterface extends RBI implements Loan {		//asks to override unimplemented methods e.g homeLoan & carLoan

	public static void main(String[] args) {
	
		SBIwithInterface home = new SBIwithInterface();
		home.homeLoanIntRate();
		home.homeLoan();
		home.carLoan();
		

		}

	public void homeLoanIntRate()
	{
		System.out.println("Home loan interest rate is 9%");
	}

	@Override
	public void homeLoan() {		//override = implements kind of
		
		//Tip : In Interface, by default you have to do method overridding
		//In interfaces, methods are unimplemented but in class you are implementing
		
		
		System.out.println("SBI providing home loan");
		
	}

	@Override
	public void carLoan() {
		
		System.out.println("SBI providing car loan");
		
	}
	
	}


