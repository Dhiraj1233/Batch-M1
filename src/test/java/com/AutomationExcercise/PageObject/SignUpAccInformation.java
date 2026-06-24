package com.AutomationExcercise.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class SignUpAccInformation extends BasePage
{
	//Enter Account Information
	@FindBy(xpath = "//b[text()='Enter Account Information']")
	private WebElement accinfo;
	@FindBy(id = "id_gender1")
	private WebElement title;
	@FindBy(id ="name")
	private WebElement name;
	@FindBy(id="email")
	private WebElement email;
	@FindBy(id="password")
	private WebElement password;
	@FindBy(id="days")
	private WebElement dayDD;
	@FindBy(id="months")
	private WebElement monthDD;
	@FindBy(id="years")
	private WebElement yearDD;
	@FindBy(id="newsletter")
	private WebElement newsletterCheckBox;
	@FindBy(id="optin")
	private WebElement partnersCheckbox;
//	Address Information
	
	
	public SignUpAccInformation(WebDriver driver)
	{
		super(driver);
	}
	public WebElement setAccinfo() {
		return accinfo;
	}
	public WebElement setTitle() {
		return title;
	}
	public WebElement setName() {
		return name;
	}
	public WebElement setEmail() {
		return email;
	}
	public WebElement setPassword() {
		return password;
	}
	public  WebElement setDayDD() {
		return  dayDD;
	}
	public WebElement setMonthDD() {
		return monthDD;
	}
	public WebElement setYearDD() {
		
		return yearDD;
	}
	public void setNewsletterCheckBox() {
		newsletterCheckBox.click();
	}
	public void setPartnersCheckbox() {
		partnersCheckbox.click();
	}
}
