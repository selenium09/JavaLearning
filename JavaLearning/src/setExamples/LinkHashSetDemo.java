package setExamples;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class LinkHashSetDemo {
	
	public static void main(String[] args) {
		// keeps insertion order
			
		
		LinkedHashSet<String> values = new LinkedHashSet<String>();
		values.add("Selenium");
		values.add("QTP");
		values.add("Winium");
		values.add("1");
		values.add("abc");
		
		System.out.println(values);
		
		//index would not work so you can take iterator or for loop
		
		System.out.println("For loop results are: ");
		
		for(String e:values)
		{
			System.out.println(e);		//
		}
		
		//tree set example - keep the order - your preference ascending or descending
		
		TreeSet<String> tree = new TreeSet<String>();
		tree.add("Sumit");
		tree.add("Rajhans");
		tree.add("can");
		tree.add("Code");
		tree.add("now");
		tree.add("TATA");
		tree.add("23");
		tree.add("code");
		
		System.out.println(tree);	//ascending
		
		//converting sets to list
				ArrayList<String> list = new ArrayList<>(values);
				System.out.println("The converted list is "+list);
				
				for(String f:list)
				{
					System.out.println(f);	
					
				}
				
		
	}

}
