package abstractClass;

public abstract class ITDept implements Emp{		//because of salary, IT class has to be converted to abstract
													// and if it is a abstract class, you can't create an object

	@Override
	public abstract void salary();  //since IT dept cant handle Sal, and when we remove method body-we get error.So, either add a body or make it abstract class

	@Override
	public void goodies() {
	
		System.out.println("Laptop goodies");
		
	}

	@Override
	public void work() {
		
		System.out.println("Automation work");
		
	}
	

}
