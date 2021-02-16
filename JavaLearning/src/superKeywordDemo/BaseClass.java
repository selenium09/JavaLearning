package superKeywordDemo;

//super keyword is one of reserved keywords in java also called reference variable.
//will be used with variables, methods and constructors
//only condition - can only be used with inheritance


//with variable
//Scenario : when parent class and child class have the same variable with same name, and child class wants to access the parent class variable
//in that case we use super keyword  =  super.keyword

//with method
//Scenario : when parent class and child class have the same method name and if we want to call parent class method, then we call super keyword
//super.method()
//super.method(a,b)

//with constructor
//Scenario : whenever we call base class constructor from child class , we can use super()
//super()
//super(a,b)

//Super should be first statement in derived class constructor.

//if we do not call base class constructor then by default java internally calls base class constructor with zero argument.

//if base class does not have zero argument constructor then java throws compile time error.

//when childclass calls constructor of parent class and again if parent class calls constructor of grandparent class, then this process
//is called constructor chaining


public class BaseClass {

	int int_rate = 8;
	
	public void showMeIntRate(){
		System.out.println("Interest rate of RBI is "+int_rate);
	}
	
	public void showMeClassName(){		//will create same class in childclass also
		System.out.println("I am in base class");
	}
	
}
