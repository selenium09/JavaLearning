package wrapperClassDemo;		//Boxing and UnBoxing

//Boxing means 

public class FourthDemoWrapper {

	public static void main(String[] args) {
		
		int a =100;			//this is example of autoboxing - we haven't given any explicit conditions
		Integer b = a;		//boxing when you convert primitive to object - int a variable converted to object type b
		System.out.println("Autoboxing "+b);
		
		//Autoboxing - Java does it automatically-t is automatic conversion Java amkes  between primitive data type to corresponding object wrapper class
		 
		//normal boxing
		int x =90;
		Integer y = Integer.valueOf(x); 	//method called "value of"-if you pass int or string, it will return you int class object
		
		System.out.println("Boxing "+y);
		
		
		//unboxing- when we convert object of wrapper class object to its respective primitive type
		//converts object to a normal variable
		
		Integer result = 100;
		int newResult = result.intValue();		//normal un-boxing because we are calling result.intvalue()
		
		System.out.println("Unboxing "+newResult);
		
		//Auto un-boxing
		
		Integer marks = 78;
		int newMarks = marks;  //converted directly my object into primitive type
		System.out.println("Auto Unboxing "+newMarks);		//doc.oracle.com
		
		
		
		
		
		
		
	}

}
