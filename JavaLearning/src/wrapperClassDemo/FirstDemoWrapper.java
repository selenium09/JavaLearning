package wrapperClassDemo;

public class FirstDemoWrapper {
	
	//Wrapper classes are predefined class by java which can contain primitive data type.see diagram 1.3
	//in simple words, we can wrap a primitive value to wrapper class object- it will wrap your primitive data to wrapper class

	public static void main(String[] args) {
		
		int a = 100;			//it contains a int variable a with value 100
		System.out.println("Primitive "+a);
		
		Integer b = 200;		//b is object of integer type which contains the value of 200 along with reference of this object(b).
		System.out.println("Wrapper "+b);		//debug to find the difference - since its an object, we can call many methods using dot.
		
		//why use wrapper class?
		//for example when we got amazon and click a product to gettext its price, it will be fetched as string but it is actually an integer/float value
		//so we need wrapper to parse that string to int/float

	}

}
