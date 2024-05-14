package com.selenium;

import org.openqa.selenium.WebDriver;

public class LaunchBrowser {

	static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//how to launch the browser in updated versions
		
		 
		LoginPage page = new LoginPage(driver);
		page.getPhoneNoTextField().sendKeys("sdfghjkm,");
		
		
		

	}

}
