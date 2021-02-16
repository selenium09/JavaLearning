package conditionalStatements;

public class ifElseifDemo {

	public static void main(String[] args) {
		
		System.out.println("Testcase started");
		
		String browser = "IE";
		if(browser.equalsIgnoreCase("Chrome")) //equals ignore case is used to ignore upper/lower case or equals(it does direct comparison)
		{
			System.out.println("Testcase executed on Chrome");
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{
			System.out.println("Testcase executed on firefox");
		}
		else if(browser.equalsIgnoreCase("IE"))
		{
			System.out.println("Testcase executed on IE");
		}
		else
		{
			System.out.println("Please provide a valid browser name");
		}
		System.out.println("Testcase ended");

	}

}
