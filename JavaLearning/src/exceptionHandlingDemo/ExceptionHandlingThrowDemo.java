package exceptionHandlingDemo;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

//handle compile time exception using throw, throw keyword is a reserve keyword in java which is used to throw exception from one piece of code
//it gives message to the programmer that while working on this class/method that you might get this exception, so that programmer can handle the exception.
//mainly used to handle checked exceptions

public class ExceptionHandlingThrowDemo {
	
	public static void main(String[] args) throws InterruptedException, FileNotFoundException {
												//if you dont know what exception might come, just add exception instead of all throws - throws Exception
		Thread.sleep(5000);
												//while working with threads, chances are high that some priority thread will interrupt your code or the sleep period, so you get InterruptedException
												//so when you use sleep method you will get exception, so you need to handle them
												//this code shows error, and suggests either use try catch or throws
												//throw is not recommended, as we are actually skipping the step - so who will handle the exception as you are also skipping, JVM will handle-and if JVM can't then it will terminate the program.
		
		FileInputStream fis = new FileInputStream("");   		//another example-it throws file not found exceptions as java says you might give wrong path or empty path
																//so if you are completely sure that it will not throw any exception, go for throw otherwise use try catch
		
		try {													//works with applets and throws AWT exception
			Robot a = new Robot();												//or go for try catch
			} 
		catch (AWTException e) 
			{
					e.printStackTrace();				//find about null pointer and no such element exception
			}									
		
											
	}

}
