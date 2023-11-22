package com.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseTest;

public class LoginFunctionality extends BaseTest{
	@FindBy (xpath = "//input[@id='txt-username']")
	WebElement UsernameField;
	
	@FindBy (xpath = "//input[@id='txt-password']")
	WebElement PasswordField;
	
	@FindBy (xpath = "//button[@id='btn-login']")
	WebElement LoginButton;
	
	public LoginFunctionality() {
		PageFactory.initElements(driver, this);
	}
	public void VerifyValidLogin() throws Throwable {
		Thread.sleep(2000);
		UsernameField.sendKeys(prop.getProperty("ValidUsername"));
		
		Thread.sleep(2000);
		PasswordField.sendKeys(prop.getProperty("ValidPassword"));
		
		Thread.sleep(2000);
		LoginButton.click();
		
	}
	public void VerifyInvalidLogin() throws Throwable {
		Thread.sleep(2000);
		UsernameField.sendKeys(prop.getProperty("InvalidUsername"));
		
		Thread.sleep(2000);
		PasswordField.sendKeys(prop.getProperty("InvalidPassword"));
		
		Thread.sleep(2000);
		LoginButton.click();
	}
	
}
