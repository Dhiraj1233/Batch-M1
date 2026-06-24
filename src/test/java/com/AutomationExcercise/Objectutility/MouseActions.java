package com.AutomationExcercise.Objectutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MouseActions 
{
	public void rightClick(WebDriver driver,WebElement element)
	{
		UtilityObjects.mouseActions(driver).contextClick(element).perform();
	}
	public void doubleClick(WebDriver driver,WebElement element) 
	{
		UtilityObjects.mouseActions(driver).doubleClick(element).perform();
	}
	public void mouseHover(WebDriver driver,WebElement element)
	{
		UtilityObjects.mouseActions(driver).moveToElement(element).perform();
	}
	public void dragDrop(WebDriver driver,WebElement source,WebElement target)
	{
		UtilityObjects.mouseActions(driver).dragAndDrop(source, target).perform();
	}
	public void scroll(WebDriver driver,WebElement element)
	{
		UtilityObjects.mouseActions(driver).scrollToElement(element).perform();
	}
}
