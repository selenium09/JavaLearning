package inheritanceDemo;

public class ChildClass3 extends BaseClassDemo {	

	public static void main(String[] args) {
	
	//base class reference and child class object-this will allow to access all the methods of base class only  and not child class methods
		
		//reference is important-even if you give baseclass refernce but you are using object of childclass3 - mul and div will give error
		//reference is pointing to base class and it has only add and sub.
		
		BaseClassDemo obj1 = new ChildClass3();
		obj1.add();
		obj1.sub();
		//obj1.mul();
		//obj1.div();
		
		
		//Fourth scenario= child refernce and base class object - this will be invalid scenario.
		//ChildClass3 obj2 = new BaseClassDemo();		//error :Child can't hold parent.
		//obj2.add();									//cannot convert baseclass to childclass
		//obj2.sub();
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
