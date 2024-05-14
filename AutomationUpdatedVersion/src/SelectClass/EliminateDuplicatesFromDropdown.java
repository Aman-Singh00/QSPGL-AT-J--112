package SelectClass;

import java.nio.file.spi.FileSystemProvider;
import java.time.Duration;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EliminateDuplicatesFromDropdown {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("file:///C:/Users/AMAN%20SINGH/OneDrive/Desktop/Dropdown.html");

		// identify the dropdown
		WebElement dropdown = driver.findElement(By.id("Dropdown"));

		// create the object of select class
		Select s = new Select(dropdown);

		// use getOptions()
		List<WebElement> allOptions = s.getOptions();//10 i<7afg

		// create the treeset object
		TreeSet<String> set = new TreeSet<String>();

		// for loop for capturing the options
		for (int i = 0; i < allOptions.size(); i++) { 
			String value = allOptions.get(i).getText();
			set.add(value);
		}
		
		// foreach to print the values present inside treeset
		for (String opt : set) {
			System.out.println(opt);
		}

	}

}
