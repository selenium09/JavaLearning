package stringDemo;

public class StringDemo1 {

	public static void main(String[] args) {
		String name = "Selenium Webdriver";
		boolean status = name.startsWith("Selenium");	//starts with method
		System.out.println("Status is "+status);

		String name1 = "Welcome to Selenium webdriver world";
		boolean status1 = name1.endsWith("Welcome");		//ends with function
		System.out.println("New status is "+status1);
		
		String expected = "welcome to selenium webdriver world";
		boolean status2 = name1.equalsIgnoreCase(expected);		//equals ignore case
		System.out.println("Status is "+status2);
		
		boolean status3 = name1.equals(expected);		//equal case
		System.out.println("Status is "+status3);
		
		String expected1 = "Selenium";					//contains method - it is case sensitive
		boolean status4 = name1.contains(expected1);
		System.out.println("Status is "+status4);
		
		
		
	}

}
