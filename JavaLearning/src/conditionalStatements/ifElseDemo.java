package conditionalStatements;

public class ifElseDemo {

	public static void main(String[] args) {
		int a = 90;
		if(a<100)
		{
			System.out.println("First if-block value of A is "+a);
		}
		
		if(a<95)//this statement is false, hence it will not be printed
		{
			System.out.println("Second if-block value of A is "+a);
		}
		
		
	}

}
