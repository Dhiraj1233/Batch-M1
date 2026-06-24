package com.AutomationExcercise.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage
{
	@FindBy(xpath = "//a[text()=' Home']")
	private WebElement homePageText;

	@FindBy(xpath = "//i[@class='fa fa-lock']")
	private WebElement signUpLoginBtn;
	
	
	public HomePage(WebDriver driver) {
		super(driver);
	}
	public WebElement verifyHomePage()
	{
		return homePageText;
	}
	public WebElement clickSignUpLogin()
	{
		return signUpLoginBtn;
	}
	
}
