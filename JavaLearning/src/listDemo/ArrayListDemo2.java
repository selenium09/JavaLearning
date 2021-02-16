package listDemo;		//enhanced for loop

import java.util.ArrayList;

public class ArrayListDemo2 {
	
	//Collections are dynamic data structure, it will grow dynamically and grows until your heap memory is not full.
	//collections in java is a framework that provides an architecture to store and manipulate the group of objects.You dont need to give datatype
	//by default collections considers everything as an object
	//collection framework has interfaces such as Set, list. queue, deque etc and classes as ArrayList, Vector, LinkedList, Priority queue, Hashset etc.
	//refer diagram 1.6
	
	//Arraylist class uses dynamic array to store objects, can contain duplicate entries, maintains insertion order so can located by index number.
	//Allows random access since it uses index, Manipulation is slow because a lot of shifting needs to occur if any element is removed from array list.e.g if we delete a value at 58, then it first finds the value, deletes it then updates it from index 0.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		ArrayList obj1 = new ArrayList();			//list, arraylist, Collections are coming from package java.util
		obj1.add(78787878);
		obj1.add('M');
		obj1.add("Selenium Webdriver");
		obj1.add(12.34);
		
		for(Object abc:obj1)			//since we are accpeting everything as object and dummy variable for it abc and colon and,
		{								//the list you want to iterate obj1,
			System.out.println("Values are "+abc); 							//each time obj1 iterates, it will assign a value to abc	
		}
	}

}
