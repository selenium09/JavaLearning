package datatypeDemo;

public class VariableDemo {
	static int mynumber;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//declaration of variable-boolean can take only true/false
		boolean status;
		//initialisaion
		status = true;
		boolean newstatus = false;
		System.out.println("My old status was "+status);
		System.out.println("My new status is "+newstatus);
		
		//chardemo range- 0 to 65536(not signed)
		//in single quotes whatever value you give is considered as char
		
		//it will evaluate the number in unicode table and find the corresponding value in table for it.
		char a = 'M';
		char b = 'O';
		char c = 70;
		
		System.out.println("First char value is "+a);
		System.out.println("Second char value is "+b);
		System.out.println("Third char value is "+c);
		
		//byte : -128 to 127
		//short: -32768 to 32767
		//int : -2,147,483,648 to 2,147,483,647
		
		byte marks = 98;
		System.out.println("My maths marks are "+marks);
		
		short total_money = 150;
		System.out.println("My total_money is "+total_money);
		
		int mymobile=84458985;
		System.out.println("My total_money is "+mymobile);
		
		long newnumber = 1234567894;
		System.out.println("My total_money is "+newnumber);
		
		//float
		//typecasting - basically java takes every value as double as it doesn't want to loose data
		//so now we selected float and forcefully converted the data, this is called type casting.
		float my_marks=(float) 60.89;
		//or
		float my_maths_marks = 86.89f;
		
		double my_new_marks=4545.65;
		
		System.out.println(+my_marks);
		System.out.println(+my_maths_marks);
		System.out.println(+my_new_marks);
		
		//downcasting int value changed to 45 from decimal
		int d = (int)45.45;
		System.out.println(+d);
		
		//inside any method or to a local variable you have to assign some value, other wise, if empty, Java considers it garbage value
		//and doesn't allow you to run
		int e=25;
		System.out.println(e);
		
		//on the contrary, Global variables are not inside any method and are by default assigned value of null.
		System.out.println(mynumber);
		
		
		
		
		
		
		
	}

}
