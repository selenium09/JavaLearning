package compilePolymorphism;

public class CompileDemo1 {			//overloading

	public static void main(String[] args) {		
		//java will not allow you to write same method twice with same signature
		//method can be overloaded if and only if method has same name but different signatures
		//signature consists of number of argument, type of argument, and order of argument.
		
		//why compilation binding, because at the compilation itself we are aware that which method would be called
		//e.g. in first add method we know 2 arguments(because it is matching with the signature) would be passed and similarly for next one as 3.
		//early binding because before running the program the methods are already binded with parameters-2 or 3 or datatype orders
		
		CompileDemo1 obj1 = new CompileDemo1();
		obj1.add(25, 89);
		obj1.add(56, 78, 33);
		obj1.add(555.55, 222.35);
		obj1.add(26, 58.333);
		obj1.add(265.23, 22);
		
	}
	
	// number of arguments

	public void add(int a, int b)		//signatures-arguments should be different to overload a method
	{
		int c = a+b;
		System.out.println("Sum of numbers is "+c);
	}
	
	public void add(int a, int b, int d)
	{
		int c = a+b+d;
		System.out.println("Sum of numbers is "+c);
	}
	
	//type of arguments - java accepts if you have different type of argument-changed int to double
	
	public void add(double a, double b)
	{
		double c = a+b;
		System.out.println("Sum of numbers is "+c);
		
	}
	
	public void add(int a, double b)
	{
		double sum = a+b;				//internal typecasting - upcasting-integer has been converted to double
		System.out.println("Sum of numbers is "+sum);
	}
	
	//changed the order again - java accepted-required is changing of order
	
	public void add(double a, int b)
	{
		double sum = a+b;				
		System.out.println("Sum of numbers is "+sum);
	}
		
	
	
	
	
	
	
}
