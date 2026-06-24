package com.AutomationExcercise.TestCase;


import org.openqa.selenium.Point;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.AutomationExcercise.BasePage.BaseClass;
import com.AutomationExcercise.Objectutility.HandlingDropdown;
import com.AutomationExcercise.Objectutility.JseUtility;
import com.AutomationExcercise.Objectutility.MouseActions;
import com.AutomationExcercise.PageObject.HomePage;
import com.AutomationExcercise.PageObject.SignUpAccInformation;
import com.AutomationExcercise.PageObject.SignupOrLoginPage;

public class TestCase_01_RegisterUser  extends BaseClass
{
	@Test
	public void registerUser()
	{
		HomePage hp = new HomePage(driver);
		hp.verifyHomePage().isDisplayed();
		hp.clickSignUpLogin().click();
		SignupOrLoginPage spl=new SignupOrLoginPage(driver);
		spl.verifySignUp().isDisplayed();
		spl.enterName().sendKeys("Admin");
		spl.enterEmail().sendKeys("admin@hotmail.com");
		JseUtility util = new JseUtility();
		util.scrollIntoView(driver, spl.clickSignUpBtn());
		spl.clickSignUpBtn().click();
		SignUpAccInformation accinfo=new SignUpAccInformation(driver);
		accinfo.setAccinfo().isDisplayed();
		accinfo.setTitle().click();
		accinfo.setPassword().sendKeys("Admin@1234");
		HandlingDropdown dropDown=new HandlingDropdown();
		dropDown.selectOptions(accinfo.setDayDD(),"8");
		dropDown.selectOptions(accinfo.setMonthDD(), "September");
		dropDown.selectOptions(accinfo.setYearDD(),"1999");
		accinfo.setNewsletterCheckBox();
		accinfo.setPartnersCheckbox();
	}
}