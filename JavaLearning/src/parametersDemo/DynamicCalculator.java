package parametersDemo;

public class DynamicCalculator {	//dont want to return hence no main-will call it from another class

	public static String getmyfullname(String firstname, String lastname)
	{
		String fullname = firstname+" "+lastname;
		return fullname;
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
