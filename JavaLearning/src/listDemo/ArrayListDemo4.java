package listDemo;		//Arraylist with generic
						//array list implements list interface and list also extends collection interface
import java.util.ArrayList;

public class ArrayListDemo4 {
	
	
	public static void main(String[] args) {
		
		ArrayList<String> obj1 = new ArrayList<String>(); 	//it only takes strings now, when specified. and shows only add string function
		obj1.add("Mukesh");
		obj1.add("Selenium");
		obj1.add("HP QTP");
		
		for(String v:obj1)		//since all passing values are string so we dont need to pass/create an object, just one variable v to store values coming from obj1 iterating
		{
			System.out.println(v);
		}
	}

}
