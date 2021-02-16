package classDemo;

public class SecondClassDemo {

	public static void main(String[] args) {
	// If I am in another class, and if I want to access calculator I have to create an object of the class.
		
		Calculator calc = new Calculator();
		calc.sum1();
		calc.sub();
		
		System.out.println("Name is "+calc.name); //you can access the state/values by using the object of calculator
		System.out.println("Hobby is "+calc.hobby);
	}

}
