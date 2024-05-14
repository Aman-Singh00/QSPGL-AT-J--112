package Synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WorkingWithExplicitWait {
	
	
	public static void main(String[] args) {
		
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(20) );
		d.get("https://shoppersstack.com/");
		
		d.findElement(By.xpath("//div[@class='featuredProducts_cardFooter__B8KN4']")).click();
		d.findElement(By.xpath("//input[@id='Check Delivery']")).sendKeys("112233");
		
		WebElement checkButton = d.findElement(By.xpath("//button[@id='Check']"));
		
		WebDriverWait wait = new WebDriverWait(d, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(checkButton));
				
		checkButton.click();	
	}

		
	}

