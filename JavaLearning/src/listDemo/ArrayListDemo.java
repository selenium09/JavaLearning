package listDemo;		//array list and normal for loop

import java.util.ArrayList;

public class ArrayListDemo {
	
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
		
		System.out.println(obj1);		//displays all values in a list
		
		System.out.println(obj1.get(2));		//gives value at index 2
		
		int myListSize = obj1.size();			//normal for loop
		for(int i=0;i<myListSize;i++)
		{
			System.out.println("Value of array list for index "+i+" is "+obj1.get(i));
		}
		
		
	}

}
