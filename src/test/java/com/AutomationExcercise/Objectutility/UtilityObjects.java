package com.AutomationExcercise.Objectutility;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class UtilityObjects 
{
	//mouse actions
	public static Actions mouseActions(WebDriver driver)
	{
		Actions action = new Actions(driver);
		return action;
	}
	//dropdowns actions
	public static Select handleDropdown(WebElement element)
	{
		Select dropdown = new Select(element);
		return dropdown;
	}
	//javascriptexecutor actions
	public static JavascriptExecutor javaScriptActions(WebDriver driver) 
	{
		JavascriptExecutor jse =(JavascriptExecutor)driver;
		return jse;
	}
}
