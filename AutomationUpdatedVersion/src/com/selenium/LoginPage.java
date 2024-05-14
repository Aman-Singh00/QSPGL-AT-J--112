package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="email")
	private WebElement phoneNoTextField;
	
	@FindBy(id ="phoneno")
	private WebElement passwordTextField;
	
	public WebElement getPhoneNoTextField()
	{
		return phoneNoTextField;
	}
	
	public WebElement getPasswordTextField()
	{
		return passwordTextField;
	}
	
	
	
	
	
	public void validLogin()
	{
		phoneNoTextField.sendKeys("sdfghjk");
	}
	
	
	
	
	
	

}
