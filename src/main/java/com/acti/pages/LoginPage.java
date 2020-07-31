package com.acti.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.acti.base.DriverScript;

public class LoginPage extends DriverScript {
	@FindBy(id = "username")
	WebElement usernameTextbx;
	@FindBy(name = "pwd")
	WebElement passwordTextbx;
	@FindBy(id = "loginButton")
	WebElement loginbutton;
	@FindBy(xpath = "//div[@class=atLogoImg")
	WebElement actilogo;

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	/**
	 * @param username
	 * @param password
	 */
	public void ValidateLoginFunction(String username, String password) {
		usernameTextbx.sendKeys(username);
		passwordTextbx.sendKeys(password);
		loginbutton.click();
	}
	
	public boolean VerifyActiLogo() 
	{
		return actilogo.isDisplayed();
	}
	
	public String VerifyActiPageTitle() {
		return driver.getTitle();
	}
}
