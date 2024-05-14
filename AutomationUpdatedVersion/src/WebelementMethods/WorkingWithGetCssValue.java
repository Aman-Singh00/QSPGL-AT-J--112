package WebelementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithGetCssValue {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		//identifying create new button
		WebElement cnb = driver.findElement(By.linkText("Create new account"));

		String color = cnb.getCssValue("color");
		
		System.out.println("The color they used is :"+color);
	
		//-------------------------------------------------
		String fontSize = cnb.getCssValue("font-size");
		
		System.out.println("Font size is "+ fontSize);
		
		
		
		
	}

}
