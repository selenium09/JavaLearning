package abstractClass;

//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;

public class HR extends ITDept{		//now, since HR extends this class, it has to implement salary method or java will give error
									//otherwise you cant compile your code
	public static void main(String[] args) {
		
		//first scenario
		HR hr = new HR();
		hr.goodies();
		hr.work();
		hr.salary();  			//since we made object of child class and ref of HR, all methods can be called 
		hr.bonus(); 			//can access as ref and obj are of HR team
		
		
		//second scenario
		ITDept it = new HR();
		it.goodies();
		it.work();
		it.salary();
		//it.bonus();     //cant access because even though obj is of HR, but ref is pointing to ITDept
		
		//third scenario
		//ITDept itd = new ITDept();		//you can't instantiate ITDept-because abstract
		//but why can't we create object of abstract?
		//java says, if your class is not fully implemented the we will not allow you to create object
		//in interface, we dont even have a single method implemented, there fore we cant make object
	
		//example : In Selenium, .By class is abstract because it contains findElements() method which is abstract method.
		
		//WebDriver driver = new ChromeDriver();		//this is an example of abstraction
		//webdriver is an interface and chromedriver is a class and this class has implemented all the methods of webdriver.
		//you dont know what is happening in background, how browser is getting invoked-services and all.
		
		
	}

	@Override
	public void salary() {		//need to implement it now
		System.out.println("Salary 5 lacs per annum");
		}

	
	//now I create a indigenous method of HR - this method only belongs to HR team
	public void bonus()
	{
		System.out.println("Bonus is 1 lakh");
	}
	
}
