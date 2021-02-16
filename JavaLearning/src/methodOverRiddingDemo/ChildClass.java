package methodOverRiddingDemo;

public class ChildClass extends Parent{

	public static void main(String[] args) {
		// for overridding you need to extend class
		//for overloading extend/inheritance is not required because you can achieve overloading in same class
		//for overridding you need a separate class 

		ChildClass obj1 = new ChildClass();
		obj1.display(); 			//we have display method in parent as well as in class but it will take only method from child class-this is overridding
							//since reference is pointing to childclass and object is also of childclass, so display method will come from childclass  
		
		Parent obj2 = new Parent();
		obj2.display(); 	//since reference is pointing to parent class and object is also of parent class, so display method will come from parent class
		
		Parent obj3 = new ChildClass();
		obj3.display();   	//even if reference is pointed to parent, if object is of child class, child class display will be used, becausse we have overridden the behavior.
		
		//ChildClass obj4 = new Parent();		//java wont allow saving a parent class object into child class reference
		
		
	}
	
	public void display(String name){
		System.out.println("I am in child class display string method");
	}
	
	public void display(){			//upper arrow for overridden method
		System.out.println("I am in child class display method");
	}

}
