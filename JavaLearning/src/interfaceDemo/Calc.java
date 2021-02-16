package interfaceDemo;

//Interface is a special kind of class which contains method declaration but doesn't contain a body
//it has static constants and abstract methods only.
//whatever variables you create, you cannot change their value because they are final static constants in nature.
//unless you create/implement mentioned methods(add, sub, mul) of interface in classes, you can't create object of your classes.

public interface Calc {

	final int x = 10;		//variables in interface are final, and hence we can use but can't change their values.	
	public void add();
	public void sub(); //you can't write a body, if you do java throws error saying "abstract methods do not specify a body) 
	
}
