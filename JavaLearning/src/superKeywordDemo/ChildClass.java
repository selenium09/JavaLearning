package superKeywordDemo;

public class ChildClass extends BaseClass{
	
	int int_rate = 10;			//will use the same variable as Baseclass' an change the value 

	public static void main(String[] args) {
		
		ChildClass obj1 = new ChildClass();
		System.out.println(obj1.int_rate);		//child class object so upper value will be called
		
		obj1.showMeIntRateFromPvtBank(); 		//will give 10 as rate because it takes upper value of childclass & different value with Super(shown below)
		
	}
	
	public void showMeIntRateFromPvtBank(){		//making a class with different name
		//System.out.println("Interest rate of Pvt bank is "+int_rate); 		//gives 10
		
		System.out.println("Interest rate of Pvt bank is "+super.int_rate);		//gives 8 - as we are telling it to go to the base class and fetch int_rate
		showMeClassName();		//called method here will call child class
		
		super.showMeClassName(); 	//this will call base class
									//same method for calling base class/child class variables
		
	}
	
	
	public void showMeClassName() 	// created same class in baseclass also
	{	
		System.out.println("I am in child class");		//now if I call this method in showMeIntRateFromPvtBank() - it will call childclass result
	}

}
