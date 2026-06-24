package com.AutomationExcercise.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
public class SignupOrLoginPage extends BasePage
{
	@FindBy(xpath = "//h2[text()='New User Signup!']")
	private WebElement newuser;
	@FindBy(xpath="//input[@placeholder='Name']")
	private WebElement name;
	@FindBy(xpath="(//input[@placeholder='Email Address'])[2]")
	private WebElement email;
	@FindBy(xpath = "//button[text()='Signup']")
	private WebElement signUpBtn;
	
	public  SignupOrLoginPage(WebDriver driver) {
		super(driver);
	}
	
	public WebElement verifySignUp()
	{
		return newuser;
	}
	public WebElement enterName()
	{
		return name;
	}
	public WebElement enterEmail() 
	{
		return email;
	}
	public WebElement clickSignUpBtn() 
	{
		return signUpBtn;
	}
}
