package constructorDemo;

public class Marks {
	
	int result;
	//constructor has same name as class name - two types : default and parameterised 
	//automatically gets invoked when you create object
	//do not have return type, not even void
	//cant be static, final, abstract and synchronised
	
	public static void main(String []args){
								
		Marks obj1 = new Marks(98);    	//pass value for the constructor to initialize -99
		
		obj1.displayResult();

	}
													
	public Marks(int marks){
		result = marks;					//here this is not used, because marks variable is different than resulkt variable
	}
	
	
	public void displayResult(){
		System.out.println("Final marks for student is "+result);
	}
	
	
}
