package parametersDemo;

public class PassParameters {
	

	public static void main(String[] args) {
		
		PassParameters obj1 = new PassParameters();
		obj1.add(255, 566);
		obj1.sub(22.66, 88.62);
		

	}
	
	public void add(int a, int b)
	{
		int c = a+b;
		System.out.println("addition result is "+c);
	}
	
	public void sub(double x, double y)
	{
		if (y>x)
		{
			double result = y-x;
			System.out.println("Substraction result is "+result);
		}
		else
		{
			double result = x-y;
			System.out.println("Substraction result is "+result);
		}
			
		
	}

}
