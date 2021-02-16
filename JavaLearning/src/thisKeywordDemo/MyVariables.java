package thisKeywordDemo;


public class MyVariables {
					
	int x;
	int y;
	
	//when we assign local variable to global variable, we use this keyword
	
	public MyVariables(int x, int y)		//another situation when, public MyVariables(int a, int b) with a and b
	{
		//x = x;		//error : the assignment to variable has no effect - add this keyword by clicking first option
		
		this.x = x;		//click qualify left hand side
		
		this.y = y;		//this way we assign value of local variable to global variable(blue color)
		
		//x = a;				//when a and b are used to assign value to global, no ambiguity since variables are different
		//y = b;
		
		
	}
	
	public void sum()
	{
		int sum = x+y;
		System.out.println(sum);
	}
	
	public static void main(String[] args) {
	
		MyVariables obj1 = new MyVariables(20, 50);
		obj1.sum();
		
//inteview question : what if i dont want to use this keyword, i am okay with x =x and y=y. then wht will be the behavior
//the variables x and y in myvariables constructor are private variables and dont make any impact on global x and y.
//so in main(), the x&y are still pointing to global variables, & when sum is called it will show 0+0 = 0 of global variable sum		
//hence you ned this.x=x to assign this value to global variable		
		
	}

}
