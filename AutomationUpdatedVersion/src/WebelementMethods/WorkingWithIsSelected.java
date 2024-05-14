package WebelementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithIsSelected {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/checkbox?sublist=0");

		Thread.sleep(2000);

		// identify the email check box
		WebElement checkbox = driver.findElement(By.id("domain1"));
		
		//checkbox.click();

		if (checkbox.isSelected()) {
			System.out.println("checkbox already selected");
		} else {
			checkbox.click();
		}

	}

}
