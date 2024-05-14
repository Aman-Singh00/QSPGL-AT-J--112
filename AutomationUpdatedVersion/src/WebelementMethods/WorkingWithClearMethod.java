package WebelementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithClearMethod {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");

		// identify the search
		driver.findElement(By.name("q")).sendKeys("iphone", Keys.ENTER);

		Thread.sleep(2000);

		// clear the value
		driver.findElement(By.name("q")).clear();

		// pass the laptop value
		driver.findElement(By.name("q")).sendKeys("laptop", Keys.ENTER);

	}

}
