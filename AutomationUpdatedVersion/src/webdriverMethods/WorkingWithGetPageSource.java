package webdriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithGetPageSource {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		//fetch the source code
		String sourceCode = driver.getPageSource();
		System.out.println(sourceCode);
		
		//close the browser
		driver.close();
	}

}
