package setExamples;

import java.util.ArrayList;
import java.util.HashSet;

public class SetDemo1 {
	
	//Set is interface in java which extends Collection interface
	//Set is unordered collection-can be ordered with classes
	//Set doesn't accept duplicate values
	//cant access with index-as its not in ordered manner
	//methods are add, clear, contains, isEmpty, iterator,remove, size  -refer diagram 1.7
	
	//Hashset stores the element by using a mechanism called hashing. It means we can't access using index.
	//Hashset contains unique elements only.
	
	//LinkedHashSet - It is similar to Hashset but maintains insertion order.
	
	//Tree set -  maintains ascending order.
	
	public static void main(String[] args) {
			
		//why irregularity in printed results?
		//java saves the values by hashing in the background, so whichever value gets encrypted first will be published first
		
		HashSet<String> values = new HashSet<String>();
		values.add("Selenium");
		values.add("QTP");
		values.add("Winium");
		values.add("1");
		values.add("abc");
		
		System.out.println(values);
		
									//index would not work so you can take iterator or for loop
		for(String e:values)
		{
			System.out.println(e);		//but you can convert the set to list and use index
			
		}
		
		//converting sets to list
		ArrayList<String> list = new ArrayList<>(values);
		System.out.println("The converted list is "+list);
		
		System.out.println("Third element of list is "+list.get(2));
		
		for(String f:list)
		{
			System.out.println(f);		//iterator
			
		}
		
		
		
	}

}
