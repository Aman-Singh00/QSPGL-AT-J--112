package SelectClass;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WorkingWithGetFirstSelectedOption {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/ui/dropdown/multiSelect?sublist=1");

		// identify the multi-select dropdown
		WebElement multiSelectDropdown = driver.findElement(By.id("select-multiple-native"));

		// create the object of select class
		Select s = new Select(multiSelectDropdown);
		
		
		for(int i=0;i<3;i++)
		{
			s.selectByIndex(i);
		}
		
		WebElement firstSelectedOptions = s.getFirstSelectedOption();
		System.out.println(firstSelectedOptions.getText());
		
		
		


	}

}
