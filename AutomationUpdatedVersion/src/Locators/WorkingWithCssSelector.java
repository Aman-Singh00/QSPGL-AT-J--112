package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithCssSelector {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");

		
		//starting character
//		WebElement search = driver.findElement(By.cssSelector("input[id^='small']"));
//		search.sendKeys("mobile");
		
		//any character
//		WebElement search = driver.findElement(By.cssSelector("input[id*='hterms']"));
//		search.sendKeys("mobile");
		
		
		WebElement search = driver.findElement(By.cssSelector("input[id$='s']"));
		search.sendKeys("books");
		
		
	}
}
