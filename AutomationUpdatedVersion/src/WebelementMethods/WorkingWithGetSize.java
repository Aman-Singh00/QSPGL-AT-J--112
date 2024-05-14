package WebelementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithGetSize {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");

		// identifying create new button
		WebElement cnb = driver.findElement(By.linkText("Create new account"));
		
		//fetch the height and width
		Dimension size = cnb.getSize();
		System.out.println(size);
		
		//fetch the x and y co-ordinate
		Point coordinates = cnb.getLocation();
		System.out.println(coordinates);
		
		
		
		
		
		
		
		
	}

}
