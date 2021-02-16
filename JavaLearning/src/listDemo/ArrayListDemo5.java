package listDemo;		//Arraylist with generic
						//array list implements list interface and list also extends collection interface
import java.util.ArrayList;
//import java.util.Collection;
import java.util.List;


public class ArrayListDemo5 {
	
	
	public static void main(String[] args) {
		
		List<String> obj1 = new ArrayList<String>(); 	          //List is parent of array list, so when you take list as reference, you will get all the methods of list interface not arraylist
		//Collection<String> obj1 = new ArrayList<String>();		  //Similarly, if you take collection, only collection methods can be used
		
		obj1.add("Mukesh");
		obj1.add("Selenium");
		obj1.add("HP QTP");
		
		//Note : When you select collection as interface-less methods will be shown-from collection and object
		//when you select list, you get methods from collection, list and object
		//when you select array list you get methods from ection, list, object and arraylist.
		//we dont use collection normally, but we use list
		
		for(String v:obj1)		
		{
			System.out.println(v);
		}
	}

}
