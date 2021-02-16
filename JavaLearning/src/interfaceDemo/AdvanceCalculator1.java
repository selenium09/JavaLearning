package interfaceDemo;				//interface

public class AdvanceCalculator1 implements Calc {

	
	public static void main(String[] args)		
	{
		
		//Second scenario
		//base class reference and child class object-this will allow to access all the methods of base class only  and not child class methods
		
		Calc obj1 = new AdvanceCalculator1();
		obj1.add();
		obj1.sub();		//can't use methods of child class
		
		
				
		//base class reference and base class object : this will allow to access all the methods of base class only.
		
		//Third scenario
		//interface class is not fully implemented-means every method should have body
		//Calc obj1 = new Calc();  //java will not allow you to create an object of interface - Scenario invalid
		
		
		//Fourth scenario= child reference and base class object - Scenarion invalid
		
		//you can't create object of an interface because it has an abstract method which does not have a body at all.
		
		//AdvanceCalculator1 obj2 = new Calc();		//cannot convert baseclass to childclass
		
	//Note : Selenium webdriver has an interface, which has get, set, findelement methods which need to be used to access selenium webdriver
	//So, they have not written the body in interface because chrome, apple can have different ways to start/close applications and write code differently.
	//hence, cross browser testing/integration is possible in selenium webdriver- browsers can be different but methods will remain same.
		
	}

	public void sin(){
		//this class' method
		System.out.println("I am in Sin method");
		
	}
	
	public void cos(){
		//this class' method
		System.out.println("I am in Cos method");
	}
	
	@Override
	public void add() {				//upper arrow sign for interface
		// TODO Auto-generated method stub and asks you to write the body
		System.out.println("I am in addtion method");
	}

	@Override
	public void sub() {
		// TODO Auto-generated method stub
		System.out.println("I am in substraction method");
	}

}
