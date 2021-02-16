package wrapperClassDemo;

public class SecondDemoWrapper {

	public static void main(String[] args) {
		
		String Price1 = "463";
		String Price2 = "237";
		
		//int result = Price1+Price2;	//cant sum string and put into int.
		System.out.println(Price1+Price2);		//concatenates but doesn't give sum
		
		//so wrapper - wrappername.parseint(variale)
		
		int p1 = Integer.parseInt(Price1);
		int p2 = Integer.parseInt(Price2);
		
		int sum = p1+p2;
		
		System.out.println(sum);
		
		if(sum==700)
		{
			System.out.println("Passed");
		}
		else
		{
			System.out.println("Failed" 	);
		}

	}

}
