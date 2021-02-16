package superKeywordDemo;

public class ParentClass {
	
	public ParentClass(){		//creating parentclass constructor
		
		System.out.println("I am in parent class constructor");
		
		//point 3 - you need to have a zero argument constructor, if you delete it from here- java will start throwing error at compile time itself.
	}
	
	public ParentClass(String name)    	//adding a same method as in childclass
	{		
		System.out.println("I am in parent class constructor "+name);	//running this wont make a difference because it will always call the default constructor
	}

	public ParentClass(String fname, String lname)    	//adding another method with more parameters
	{		
		System.out.println("I am in parent class constructor "+fname+" "+lname);	
	}

	
	
	}


