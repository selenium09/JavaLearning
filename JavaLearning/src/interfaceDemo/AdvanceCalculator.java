package interfaceDemo;				//interface

//requirement is you have to implement calc into this adv.calc, other wise advance calculator wont be valid
//since its a requirement, we will add a keyword implements after class name
//you are implementing calc interface which has certain methods - when you do this java will ask you to add the unimplemented methods, click it


public class AdvanceCalculator implements Calc {

	
	public static void main(String[] args)		//advance calc is child class and Calc is interface-base class
	{
		//child class reference and child class object-this will allow to access all the methods of base class and child class
		//same as inheritance
		
		//x = 90;		//final value x can't be assigned any other value, but can be done adding int datatype before it
		int x = 90;
		System.out.println(x);
		
		AdvanceCalculator obj1 = new AdvanceCalculator();
		obj1.add();	//interface methods
		obj1.sub();
		obj1.sin();		//child class methods
		obj1.cos();		
		
	}

	public void sin(){
		//this class' method
		System.out.println("I am in Sine method");
		
	}
	
	public void cos(){
		//this class' method
		System.out.println("I am in Cosine method");
	}
	
	@Override
	public void add() {				//upper arrow sign for interface
		// asks you to write the body
		System.out.println("I am in addtion method");
	}

	@Override
	public void sub() {
		// TODO Auto-generated method stub
		System.out.println("I am in substraction method");
	}

}
