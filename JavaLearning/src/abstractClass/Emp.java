package abstractClass;

//abstraction is process of showing the essential features and hiding(will not show the implementation) the background details e.g. webdriver driver
//has abstract keyword with the class
//even if a single method is abstract then the class becomes abstract class
//can contain abstract and non-abstract methods as well
//object of abstract class can't be created 
//every method in interface is an abstract method - no method is defined only declared or prototyped

//e.g.employee interface contains some entities(method) like goodies,sal, work and IT class will implements all its methods but IT can't handle Sal.
//so IT will mark it as abstract class and HR class will extend IT and implement that method(refer definition-diagram 1.1)

public interface Emp {
	
	public void salary();	//abstract methods
	
	public void goodies();
	
	public void work();

}
