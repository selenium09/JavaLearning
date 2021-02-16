package listDemo;		//Iterator interface

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo3 {
	
	//Collections are dynamic data structure, it will grow dynamically and grows until your heap memory is not full.
	//collections in java is a framework that provides an architecture to store and manipulate the group of objects.You dont need to give datatype
	//by default collections considers everything as an object
	//collection framework has interfaces such as Set, list. queue, deque etc and classes as ArrayList, Vector, LinkedList, Priority queue, Hashset etc.
	//refer diagram 1.6
	
	//Arraylist class uses dynamic array to store objects, can contain duplicate wntries, maintains insertion order so can located by index number.
	//Allows random access since it uses index, Manipulation is slow because a lot of shifting needs to occur if any element is removed from array list.e.g if we delete a value at 58, then it first finds the value, deletes it then updates it from index 0.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		ArrayList obj1 = new ArrayList();		//list, arraylist, Collections are coming from package java.util
		obj1.add(78787878);						//it is giving warning because everytime it considers objects, it has to assign maximum memory and it could be problematic in future, if we have huge amount of data. 
		obj1.add('M');							//this issue is resolved in generic arraylist
		obj1.add("Selenium Webdriver");
		obj1.add(12.34);
		
												//returns an iterator over the elements in this list in proper sequence
		Iterator itr = obj1.iterator();			//iterater is a seperate interface which is coming from java .util
		
		while(itr.hasNext())					//hasnext :it will check your list, if it has values it will return true and false accordingly
		{										//while loop : iterate till the value is not false
			Object value =  itr.next();			//gives the element and increments by 1, arraylist has all objects, so we need to create object instance and put the value of next in it 
			System.out.println("Values are "+value);
		}
		
	}

}
