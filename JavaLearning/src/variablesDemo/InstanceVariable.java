package variablesDemo;

public class InstanceVariable {

	int roll = 10;				//these are called instance variables not global
	double marks = 80.45;		
	//for local variables you need to initialize them, otherwise they wont be compiled
	//for loop, constructor, method - outside these local variable cant be used unless made instance variable
	//intance name because it can have different instances at different levels-methods
	
	public static void main(String[] args) 
	{
		
		InstanceVariable obj1=new InstanceVariable();   //when you have multiple objects, in that case for instance you would have respective copies of roll and marks.
		obj1.show();
		InstanceVariable obj2=new InstanceVariable();
		obj2.show();
		InstanceVariable obj3=new InstanceVariable();
		obj3.show();									//e.g. for 10 instances 10 copies will be created

	}
	
	public void show()
	{
		System.out.println("Roll numnber "+roll +" "+ "has "+marks+" marks");
	}
}
