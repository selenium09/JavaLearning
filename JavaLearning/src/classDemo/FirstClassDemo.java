package classDemo;

public class FirstClassDemo {		//it is a class

int x = 90;		//this is the state
int y = 100;

	public static void main(String[] args)     //it is a method
	{
		System.out.println("Program Started");
		
		FirstClassDemo obj1 = new FirstClassDemo();		//once object is created then the state and behavior will be activated(they will take memory in RAM)
		obj1.sum();
		
		System.out.println("Value of X is "+obj1.x);
		System.out.println("Value of Y is"+obj1.y);
		
		FirstClassDemo obj2 = new FirstClassDemo();	 //another object if created, then these 2 objects will have different memory for x and y.
		
		System.out.println("Program Ended");
		obj2.sum();
		
		System.out.println("Value of X is "+obj2.x);
		System.out.println("Value of Y is"+obj2.y);
		
		//GFG method calling
		// int n = 3, m = 6;
		 
	        // call the static method
	        int s = GFG.sum(3, 4);
	 
	        System.out.println("GFG sum is = " + s);
	        
	      //GFGA method calling
	        int o = 12, p = 15;
	        GFGA h = new GFGA();
	        
	     // call the non-static method
	        int i = h.sum(o, p);
	        
	        System.out.println("GFGA sum is = " + i);
		
		
	}
	
	
	//non static method
	public void sum()  //void means this method will not return anything // this is the behavior
	{
		int a = 90;
		int b = 100;
		int c = b+a;
		
		System.out.println("sum of two numbers is "+c);
		
	}

}

class GFG {
	 
    // static method
    public static int sum(int a, int b)
    {
        return a + b;
    }
}


class GFGA {
 
    // non-static method
    public int sum(int a, int b)
    {
        return a + b;
    }
}
