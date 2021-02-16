package superKeywordDemo;

public class SubClass extends ParentClass {
	
			public SubClass()    	//creating parentclass constructor
			{		
				System.out.println("I am in sub class constructor");
			}
			
			public SubClass(String name)    	//creating parentclass constructor
			{		
				super(name);		//if you want to make call to parent class parameterized constructor of parent class, you need to use super with paramter
									//otherwise it will call the default constructor
				//super(name, "Rajhans");	//error-super should be first statement in derived class constructor - or call it in different constructor
				
				System.out.println("I am in sub class constructor "+name);		
			}


	public static void main(String[] args) 
	{
		//SubClass obj1 = new SubClass();
		

		SubClass obj1 = new SubClass("Sumit");		//SubClass(String name)  constructor will get called
		
		//will it call default constructor - yes - whenever you create/call any object, by default parent class constructor will get called
	}
	


}
