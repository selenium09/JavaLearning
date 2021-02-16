package conditionalStatements;

public class SwitchDemo {

	public static void main(String[] args) {
		int x= 4;						//switch takes int, strings, enum
		                                //datatype should be same for comparison

		switch(x)
		{
		case 1:
			System.out.println("Performance is poor");
		break;
		
		case 2:
			System.out.println("Slow Performer");
		break;
		
		case 3:
			System.out.println("Meets Expectations");
		break;
		
		case 4:
			System.out.println("Well Done Keep rocking!");
		break;
		
		case 5:
			System.out.println("Employee of the year");
		break;
		
		default:
			System.out.println("ID not found in the system");
		
		}
		
	}

}
