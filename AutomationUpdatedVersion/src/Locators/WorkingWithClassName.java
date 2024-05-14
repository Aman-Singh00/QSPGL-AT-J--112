package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithClassName {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		//identify the web element by using id attribute
		WebElement search = driver.findElement(By.id("small-searchterms"));
		search.sendKeys("books");
		//identify the search button by using class name locator
		WebElement searchButton = driver.findElement(By.className("search-box-button"));
		searchButton.click();
		
		Thread.sleep(3000);
		//close the browser
		driver.close();
	}

}
