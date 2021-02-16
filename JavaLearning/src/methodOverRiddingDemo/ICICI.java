package methodOverRiddingDemo;

public class ICICI extends RBI{

	public static void main(String[] args) {
	
		// RBI home = new RBI();		//will give rbi interest rate of base class 8% 
		
		RBI home = new ICICI();		//method over ride as object of child class is used
		home.homeLoanIntRate();		//gives 10%

		//Tip : In Interface, by default you have to do method overridding
		//In interfaces, methods are unimplemented but in class you are implementing
		
		}

	public void homeLoanIntRate()
	{
		System.out.println("Home loan interest rate is 10%");
	}
	
	}


