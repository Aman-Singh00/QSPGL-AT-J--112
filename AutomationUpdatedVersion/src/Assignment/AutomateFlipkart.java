package Assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomateFlipkart {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");

		// searching iphone
		driver.findElement(By.name("q")).sendKeys("iphone", Keys.ENTER);

		// to get all the product name
		List<WebElement> allProductName = driver.findElements(By.xpath("//div[@class='KzDlHZ']"));

		for (WebElement name : allProductName) {
			String productName = name.getText();

			String productPrice = driver
					.findElement(By.xpath("//div[text()='" + productName
							+ "']/ancestor::div[@class='yKfJKb row']/descendant::div[@class='Nx9bqj _4b5DiR']"))
					.getText();

			System.out.println(productName + "-----" + productPrice);

		}

	}

}
