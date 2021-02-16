package thisKeywordDemo;


public class MyDrivers {

	//"this" is one of the reserved keywords in java, this keyword is also known as reference variable that refers to current class object.
	//"this" keyword can be used with variables and constructors.
	
	//when using variables, we will be referring to current class references- we use this to refer current class instance variables
	//with constructors we will be using this to call different constructors of the same class-we use this() to invoke current class constructor 
	
	//Requirement : i want to call multiple constructors but dont want to makes many objects of class we use this keyword
	
	public MyDrivers()
	{
		this("JDBC");
		System.out.println("Loading my drivers");		//by default, default constructor runs
	}													//but if you want to call all constructors, use this keyword
	
	//if you want to call multiple constructors within the same class, you will be using this keyword
	
	public MyDrivers(String name)
	{
		this(10);
		System.out.println("Loading my drivers. Name is "+name);
	}
	
	public MyDrivers(int count)
	{
		System.out.println("Loading my drivers. Count is "+count);
	}
	
	public void Display()
	{
		System.out.println("I am in display method");
	}
	
	
	public static void main(String[] args) {
		
		MyDrivers obj1 = new MyDrivers();
		obj1.Display();
		
		//real time example of this keyword
		//WebDriver driver = new ChromeDriver();
		//when we call default constructor of chromedriver, it is gain internally calling one more constructor with two arguments 
		
	}

}
