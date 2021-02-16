package wrapperClassDemo;

public class ThirdDemoWrapper {

	public static void main(String[] args) {
		
		String Price1 = "463.95";
		String Price2 = "236.05";
		
		//int result = Price1+Price2;	//cant sum string and put into int.
		System.out.println(Price1+Price2);		//concatenates but doesn't give sum
		
		//so wrapper - wrappername.parseDouble(variable)
		//Parent class for Char and Boolean is object class but for rest others(int, float, double) parent class is number class - and you will get all the methods under this class in documentation
		
		double p1 = Double.parseDouble(Price1);
		double p2 = Double.parseDouble(Price2);
		
		double sum = p1+p2;
		System.out.println(sum);
		
		
		if(sum==700)
		{
			System.out.println("Passed");
		}
		else
		{
			System.out.println("Failed");
		}

	}

}
