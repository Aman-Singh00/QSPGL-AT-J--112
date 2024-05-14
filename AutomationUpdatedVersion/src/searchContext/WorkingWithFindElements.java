package searchContext;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithFindElements {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");

		// identify the search text field and dearch iphone
		WebElement searchTextField = driver.findElement(By.name("q"));
		searchTextField.sendKeys("iphone", Keys.ENTER);

		// use findElements()
		List<WebElement> allProductName = driver.findElements(By.xpath("//div[@class='KzDlHZ']"));
		
		// print all products name in my console
		for (int i = 0; i < allProductName.size(); i++) {
			{
				String productName = allProductName.get(i).getText();
				System.out.println(productName);
			
			}
		}

	}

}
