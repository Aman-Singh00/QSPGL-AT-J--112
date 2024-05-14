package webdriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithManageMethod {
	
	public static void main(String[] args) {
		
		
		//to launch the browser
		WebDriver driver = new ChromeDriver();
		
		//how to maximize the window
//		Options opt = driver.manage();
//		Window win = opt.window();
//		win.maximize();
		
		//method chaining
		driver.manage().window().maximize();
		
		
		//acess my web application
		driver.get("https://www.flipkart.com");
	}

}
