package WebelementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithGetRect {
	
	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");

		// identifying create new button
		WebElement cnb = driver.findElement(By.linkText("Create new account"));
		
		//getRect()
		Rectangle rect = cnb.getRect();
		
		int height = rect.getHeight();
		System.out.println(height);
		int width = rect.getWidth();
		System.out.println(width);
		int x = rect.getX();
		System.out.println(x);
		int y = rect.getY();
		System.out.println(y);
		
	}

}
