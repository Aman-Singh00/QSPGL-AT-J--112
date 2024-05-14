package webdriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithQuitMethod {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		//open a window pop up
		driver.findElement(By.linkText("Open a popup window")).click();
	
		//close method
		//driver.close();
		
		//quit method
		driver.quit();
		
	}

}
