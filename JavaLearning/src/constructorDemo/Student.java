package constructorDemo;

public class Student {
	
	int result;
	//constructor has same name as class name - two types : default and parameterised 
	//automatically gets invoked when you create object
	//do not have return type, not even void
	//cant be static, final, abstract and synchronised
	
	public static void main(String []args){
								
		Student obj1 = new Student();     //if its a method, we need to add a return type
		
		//Student obj1 = new Student("DPS");	//for string school name
		
		obj1.displayResult();
	
	}
													//constructor overloaded 5 times - number, order
	public Student(){
		System.out.println("Hey welcome to school");
	}
	
	public Student(String schoolName){									//while running this, we know in main(), which consructor will be called-
		System.out.println("Hey welcome to"+schoolName+ "school");   // so at the time compilation i know- so it is called compile time polymorphism
	}
	
	public Student(int rank){
		System.out.println("Hey welcome to school");
	}
	
	public Student(String schoolName, int ranking){
		System.out.println("Hey welcome to school");
	}
	
	public Student(int ranking, String schoolName){
		System.out.println("Hey welcome to school");
	}
	
	public void displayResult(){
		System.out.println("Final marks for student is "+result);
	}
	
	
}
