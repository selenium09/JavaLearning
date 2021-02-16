package setExamples;				//tree view and handle multiple windows in Selenium

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class TreeSetDemo {
	
	public static void main(String[] args) {
		// keeps insertion order
			
		
		LinkedHashSet<String> values = new LinkedHashSet<String>();
		values.add("Selenium");
		values.add("QTP");
		values.add("Winium");
		values.add("1");
		values.add("abc");
		
		System.out.println(values);
		
		
		System.out.println("For loop results are: ");
		
		for(String e:values)
		{
			System.out.println(e);		//
		}
		
		//tree set example - keep the order - your preference descending
		
		TreeSet<String> tree = new TreeSet<String>();
		tree.add("Sumit");
		tree.add("Rajhans");
		tree.add("can");
		tree.add("Code");
		tree.add("now");
		tree.add("TATA");
		tree.add("23");
		tree.add("code");
		
		TreeSet<String> desc = (TreeSet<String>)tree.descendingSet();
		
		System.out.println("With Descending sets "+desc);	//descending
		
		
		
		//Handle multiple window 					//you can convert see to list as well
		
		//this will return number of windows opened by webdriver and will return set of string
		WebDriver driver = new ChromeDriver();
		Set<String> s1 = driver.getWindowHandles();
		
		//iterate using iterator
		Iterator<String>i1 = s1.iterator();
		
		while(i1.hasNext())
		{
			String child_window = i1.next();
		}
		
		
		
	}

}
