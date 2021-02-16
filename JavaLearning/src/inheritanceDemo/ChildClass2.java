package inheritanceDemo;

public class ChildClass2 extends BaseClassDemo {	//baseclass methods will not be shown here, but are there in backend

	public static void main(String[] args) {
	
		//base class reference and base class object : this will allow to access all the methods of base class only.
		
		BaseClassDemo obj1 = new BaseClassDemo();
		obj1.add();
		obj1.sub();
		//obj1.mul();		//start giving error because base class doesn't have mul and div method in it
		//obj1.div();
			
		
	}
	
	//to access methods of base class, i need to write the code but instead we can use 'extend' to inherit al the methods and properties of base class
	
	public void mul()
	{
		System.out.println("I am in base class and multiplication is 2500");
	}

	public void div()
	{
		System.out.println("I am in base class and division is 50");
	}
}
