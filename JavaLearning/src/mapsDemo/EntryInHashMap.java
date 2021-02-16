package mapsDemo;

import java.util.HashMap;
import java.util.Map;

//linked hash map will always support the insertion order
//hashtable does not support the insertion order
//Tree map support ascending and descending order
//learn about tree map and hashtables



public class EntryInHashMap {

	public static void main(String[] args) {
		
		HashMap<String, String> obj1 = new HashMap<String, String>();		//asks key value pairs for datatypes
		obj1.put("100","Sumit");												//put method to add values
		obj1.put("200","Rajhans");
		obj1.put("300","is");
		obj1.put("301","learning");
		obj1.put("502","Selenium");
		obj1.put("600","Java");
		obj1.put("700","with");
		
		//Entry is child/sub interface of Map interface, it will help you fetch all the entries in a map
		
		for(Map.Entry<String, String> data : obj1.entrySet())		//entrySet will get all the key value pairs
		{															//Map entry is valid till the iteration of the loop, it will take entry and save in data variable and we get keys one by one.
			System.out.println("Key from Map is "+data.getKey()+" and value is "+data.getValue());
		}
	
		
		
		
		
		
		
							
		
		
	}

}
