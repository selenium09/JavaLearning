package variablesDemo;

public class InstanceVariableNew {

	int roll;				
	double marks;	
	int x=100;
	
	public InstanceVariableNew(int roll,double marks)          //creating constructor-name same as class name
	{															//doesn't have any return type, not even void
		this.roll=roll;											//I want to assign roll, marks values at the time of object creation
		this.marks=marks;
		//so whatever values I will pass through "InstanceVariableNew()" will be assigned to global instances.												
	}	//The this keyword can be used to refer current class instance variable. 
	    //If there is ambiguity between the instance variables and parameters, this keyword resolves the problem of ambiguity.
	
	public static void main(String[] args) 
	{
		
		InstanceVariableNew obj1=new InstanceVariableNew(1,80.25);   //when you have multiple objects, in that case for instance you would have respective copies of roll and marks.
		obj1.show();
		InstanceVariableNew obj2=new InstanceVariableNew(2,90.65);
		obj2.show();
		InstanceVariableNew obj3=new InstanceVariableNew(3,95.5);  //three time constructor will be invoked and each instrance variable will have different values.
		obj3.show();									//e.g. for 10 instances 10 copies will be created

	}
	
	public void show()
	{
		int x = 90;
		System.out.println(x);			//preference is given to local variable instead of global/instance
		System.out.println("Roll numnber "+roll +" "+ "has "+marks+" marks");
	}
}
