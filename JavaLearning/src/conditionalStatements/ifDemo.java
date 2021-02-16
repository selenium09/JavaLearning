package conditionalStatements;

public class ifDemo {

	public static void main(String[] args) {
		
		System.out.println("Testcase started");
		String browser = "chrome";
		if(browser.equalsIgnoreCase("Chrome")) //equals ignore case is used to ignore upper/lower case or equals(it does direct comparison)
		{
			System.out.println("Testcase executed on Chrome");
		}
		else
		{
			System.out.println("Testcase executed on firefox");
		}
		
		System.out.println("Testcase ended");
		
	}

}
