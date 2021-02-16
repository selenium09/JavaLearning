package listDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WebDriverListExample {

	public static void main(String[] args) {
		
			WebDriver driver = new ChromeDriver();
			driver.findElements(By.xpath(""));		//it will provide you list/not arraylist of webelements -if you provide anchor type in xpath- you will get list if anchors in webpage
			
			Select sel = new Select(driver.findElement(By.xpath("")));
			
			sel.getAllSelectedOptions();	//.getoptions is going to give you a list of webelements and you can use iterator/for-enhance loops
			
			
			

	}

}
