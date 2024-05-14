package webdriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithGetTitle {
	
	public static void main(String[] args) {
		
		//launch the browser
		WebDriver driver = new ChromeDriver();
		//maximize the window
		driver.manage().window().maximize();
		//launch the web application
		driver.get("https://www.amazon.com");
		//use getTitle()
		String actual_title = driver.getTitle();
		
		//verify the title is correct or not
		if(actual_title.equals("Amazon.com. Spend less. Smile more."))
		{
			System.out.println("Title is correct");
		}
		else
		{
			System.out.println("Title is wrong");
		}
	
		
		
		
	}

}
