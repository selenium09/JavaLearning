package classDemo;

public class AdvanceCalculator     
//In static method, The memory of a static method is fixed in the ram, for this reason we don’t need the object of a class in which the static method is defined to call the static method. 
//To call the method we need to write the name of the method followed by the class name. 
{  
	 String name = "Sumit";
	 String hobby = "Table Tennis";
	
	public static void sum1()				//this time I want to use static keyword
	{
		System.out.println("It performs addition");
	}
	
	public static void sub()
	{
		System.out.println("It perform substraction");
	}
	
}
