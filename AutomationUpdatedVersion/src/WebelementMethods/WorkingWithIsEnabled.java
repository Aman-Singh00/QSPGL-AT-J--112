package WebelementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithIsEnabled {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");

		// identifying create new button
		WebElement cnb = driver.findElement(By.linkText("Create new account"));
		
//		if(cnb.isEnabled())
//		{
//			cnb.click();
//		}
//		else
//		{
//			System.out.println("webelement is disabled");
//		}
		
	System.out.println(cnb.isEnabled());
		
		
		
		
		
	}

}
