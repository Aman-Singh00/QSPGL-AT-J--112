package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomateAirVistra {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.airvistara.com/in/en");

		// clicking on accept all button
		WebElement cookies = driver.findElement(By.id("acceptAllBtn"));
		cookies.click();

		// click on one way trip radio button
		driver.findElement(By.id("onewaytrip")).click();

		Thread.sleep(2000);
		// enter some value inside from text field
		WebElement fromTextField = driver.findElement(By.xpath("//input[@name='flightSearchFrom']"));
		fromTextField.sendKeys("PNQ",Keys.ARROW_DOWN,Keys.TAB);
		
		Thread.sleep(2000);
		// enter the value in to text field
		WebElement toTextField = driver.findElement(By.xpath("//input[@name='flightSearchTo']"));
		toTextField.sendKeys("DXB",Keys.ARROW_DOWN, Keys.TAB);

		// click on departure date
		WebElement departure = driver.findElement(By.id("departCalendar"));
		departure.click();

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// click on 27 date
		WebElement date = driver.findElement(By.xpath("//a[@data-date='27']"));
		date.click();

		// click on passangers
		WebElement passenger = driver.findElement(By.id("passengers"));
		passenger.click();

		Thread.sleep(3000);
		
		// start a for to select 4 adults
		for (int i = 0; i < 3; i++) {
			driver.findElement(By.xpath("//button[@id='adds_adult']")).click();
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		WebElement done = driver.findElement(By.xpath("//button[@class='col-xs-12 done_btn aubergine-button-dark passengerModalBtn']"));
		done.click();
		
		
		//click on search flight
		WebElement searchFlight = driver.findElement(By.xpath("//button[@id='book-flight-widget']"));
		searchFlight.click();
	}

}
