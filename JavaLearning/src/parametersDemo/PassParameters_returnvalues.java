package parametersDemo;

public class PassParameters_returnvalues {
	

	public static void main(String[] args) {
		
		PassParameters_returnvalues obj1 = new PassParameters_returnvalues();
		int sum = obj1.add(255, 566);   //instead of using local variable c, we will evaluate the add function using object and store its result in sum variable.
		
		System.out.println("Sum result is "+sum);
		
		double sub = obj1.sub(22.66, 88.62);
		
		System.out.println("Substraction result is "+sub);
		
		DynamicCalculator obj2 = new DynamicCalculator();	//calling another class for returning value
		int sum1 = obj2.add(588, 365);
		System.out.println("Sum result is "+sum1);
		
		double sub2 = obj2.sub(233.564, 831.95);
		System.out.println("Substraction result is "+sub2);
		
		String myname = DynamicCalculator.getmyfullname("Sumit", "Rajhans");  //since its a static you dont need to create an object, directly call
		System.out.println("Congrats "+myname);
		
		//Concatenation trial, concat can only join strings
		String str1 = "Mighty";
		String str = myname.concat(" ").concat(str1);
		System.out.println(str);
		
		System.out.println("Printing :"+"sumit"+10+"11");		//important
		System.out.println(" "+10+10);
		System.out.println(10+10);
		System.out.println("Printing :"+10*10);					//imoortant
	
	}
	
	public int add(int a, int b)		//void changed to int to result a value
	{
		int c = a+b;
		return c;
	}
	
	public double sub(double x, double y)
	{
		if (y>x)
		{
			double result = y-x;
			return result;
		}
		else
		{
			double result = x-y;
			return result;
		}
			
		
	}

}
