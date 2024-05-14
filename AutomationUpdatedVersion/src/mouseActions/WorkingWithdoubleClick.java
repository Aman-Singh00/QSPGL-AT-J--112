package mouseActions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WorkingWithdoubleClick {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.navigate().to("https://demoapps.qspiders.com/ui/button/buttonDouble?sublist=2");
		// identify the yes button
		WebElement yesButton = driver.findElement(By.id("btn20"));
		// create the object of Actions clas
		Actions act = new Actions(driver);
		act.doubleClick(yesButton).perform();
		act.doubleClick(driver.findElement(By.id("btn22"))).perform();
	}
}
