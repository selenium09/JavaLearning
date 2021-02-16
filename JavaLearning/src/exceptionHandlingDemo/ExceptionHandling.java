package exceptionHandlingDemo;		//try catch

public class ExceptionHandling {
	
	//checked exception also known as compile time exception, are checked at compile time.Until you handle them you wont be able to compile the code itself.
	//Compiler will detect the error and give you a message to handle it, IDE users also get suggestion like use try catch, use throw

	//Unchecked exception - Exceptions checked at run-time. e.g when you write the code, syntax is correct but while running you get the logic is incorrect e.g. you passed a null value
	//at compile time it shows no error but at run time you get null pointer exception, out of bound exception.
	
	//error - Error is irrecoverable e.g out of memoryError, virtual memory error, Assertion error- you get them frequently
	
	//how to handle exception
	//Try-catch-block - java try block is used to enclose the code that might throw an exception. It must be within the method.
	//Java try block must be followed by either catch or finally block. In try block you write code that may throw exception and in catch block you need to write which class it is. 
	//in catch block you need to write the exact exception it is showing, if you dont know hen write the parent class or super class of the exception.
	
	public static void main(String[] args) {

		try 
		{	
			int c=10/0;									//inside loop write the expression which can cause exception
			System.out.println("Div result is "+c);		//if it works, it will print
			
		} 
		catch(ArithmeticException e) 			 	//inside catch write which exception it is throwing and space and object
		{									//it will store the exception in object and you can print with with get message
		
			System.out.println("Somthing went wrong please check the exception "+e.getMessage());
			System.out.println("Seems you have entered zero please provide a value>0");
		}
		System.out.println("End");
	}

}
