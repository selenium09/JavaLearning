package mapsDemo;

import java.util.HashMap;

public class HashMapDemo {
	
	//Map is an interface in java, it contains key and value pair, each key and value pair are called entry.
	//maps contain only unique keys. Easy to use if you have to search, update, delete elements on the basis of key.
	//It may have one null key and multiple null values
	//it doesn't store value in order
	//hashmap uses abstract maps class and abstract uses object class

	public static void main(String[] args) {
		
		HashMap<String, String> obj1 = new HashMap<String, String>();		//asks key value pairs for datatypes
		obj1.put("100","Sumit");												//put method to add values
		obj1.put("200","Rajhans");
		obj1.put("300","is");
		obj1.put("301","learning");
		obj1.put("502","Selenium");
		obj1.put("600","Java");
		obj1.put("700","with");
		obj1.put("700","with");		//made a duplicate value, but it will not be printed because hashmaps dont allow duplicate entries
		
		System.out.println(obj1);
		String value = obj1.get("502");
		
		System.out.println("Values for map is "+value);
		
		
		
	}

}
