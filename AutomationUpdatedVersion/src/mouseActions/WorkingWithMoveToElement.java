package mouseActions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WorkingWithMoveToElement {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://qspidersglobal.com/learn/");
		// identify the more web element
		WebElement more = driver.findElement(By.xpath("//a[text()='More']"));
		// create the object of Actions class
		Actions act = new Actions(driver);
		act.moveToElement(more).perform();
	}

}
