package methodOverRiddingDemo;

//whenever you try to overwrite method behavior or overwrite certain features is called method overridding.
//dynamic binding or dynamic method dispatch - when parent and child class have similar method with similar signature - number, type and order of parameter

public class Parent {
	
	public void display()
	{
		System.out.println("I am in parent class display method");
	}
	
	public void show()
	{
		System.out.println("I am in parent class show method");
	}

}
