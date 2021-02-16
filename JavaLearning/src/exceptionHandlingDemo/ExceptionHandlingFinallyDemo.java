package exceptionHandlingDemo;		//try catch

import java.util.InputMismatchException;

public class ExceptionHandlingFinallyDemo {
	
	public static void main(String[] args) {

		try 
		{	
			int c=10/0;									//inside loop write the expression which can cause exception
			System.out.println("Div result is "+c);		//if it works, it will print
			
		} 
		
		//catch(Exception e)								//trick question : what if parent class(Exception0 is written before arithmetic or input mismatch
		//{													//the below exception handles wont work, because parent will handle all errors, so below code is called "Dead code" as 
		//	System.out.println("Something went wrong, please check");	//it will never be executed, so always make sure parent class comes at last-you can keep throwable but but can't keep object
		//}
		
		catch(ArithmeticException e) 			 		//inside catch write which exception it is throwing and space and object
		{												//it will store the exception in object and you can print with with get message
		
			System.out.println("Somthing went wrong please check the exception "+e.getMessage());
			System.out.println("Seems you have entered zero please provide a value>0");
		}
		catch(InputMismatchException e)					//what if there is another exception, so you can give multiple catch
		{												//this is incase there is something wrong with input
			System.out.println("Please enter integer values");
		}		
		catch(Exception e)								//any other exception this will handle
		{
			System.out.println("Something went wrong, please check");
		}
		
		
		finally											//finally is optional, but is a good practice to use 
		{
			System.out.println("Finally Block");		//finally means it doesn't mean your program has exception or not, this piece of code will always run
			System.out.println("End");					//very useful when you are working with file handling or database, it is mandatory to close all the files & database connection
														//and then the message is displayed
		}
		
		
	}

}
