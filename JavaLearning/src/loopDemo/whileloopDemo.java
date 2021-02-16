package loopDemo;

public class whileloopDemo {

	public static void main(String[] args) {
		int count = 50;
		
		while(count<=80)
		{
			System.out.println("values are "+count);
		    count++;
		}

		
		//do while loop
		//in this the loop will check the condition atleast once
		int ticket = 75;
		do{
			System.out.println("the ticket values are "+ticket);
			ticket++;
		}while(ticket<=100);
	}

}
