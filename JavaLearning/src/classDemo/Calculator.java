package classDemo;

public class Calculator     //not included public static void main because we dont want to run this particular class
{  
	String name = "Sumit";
	String hobby = "Table Tennis";
	//In non-static method, the memory of non-static method is not fixed in the ram, so we need class object to call a non-static method. 
	//To call the method we need to write the name of the method followed by the class object name. 
	public void sum1()
	{
		System.out.println("It performs addition");
	}
	
	public void sub()
	{
		System.out.println("It perform substraction");
	}
	
}
