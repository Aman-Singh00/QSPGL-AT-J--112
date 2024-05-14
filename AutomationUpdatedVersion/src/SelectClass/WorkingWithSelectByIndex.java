package SelectClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WorkingWithSelectByIndex {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("file:///C:/Users/AMAN%20SINGH/OneDrive/Desktop/Dropdown.html");
		
		//identify the that particular dropdown
		WebElement dropdown = driver.findElement(By.id("Dropdown"));
		
		//use select class
		Select s = new Select(dropdown);
		
		System.out.println(s.isMultiple());
		
		//for loop
//		
//		for(int i=1;i<7;i++)
//		{
//			s.selectByIndex(i);
//			Thread.sleep(2000);
//			
//		}
		
		
		
		
		
	}

}
