package inheritanceDemo;

public class ChildClass extends BaseClassDemo {	//baseclass methods will not be shown here, but are there in backend

	public static void main(String[] args) {
	
	//child class reference and child class object-this will allow to access all the methods of base class and child class
		
		ChildClass obj1 = new ChildClass();
		obj1.add();
		obj1.sub();
		obj1.mul();
		obj1.div();
		
		
	}
	
	//to access methods of base class, i need to write the code but instead we can use 'extend' to inherit all the methods and properties of base class
	
	public void mul()
	{
		System.out.println("I am in base class and multiplication is 2500");
	}

	public void div()
	{
		System.out.println("I am in base class and division is 50");
	}
}
