package com.AutomationExcercise.Objectutility;

import org.openqa.selenium.WebElement;

public class HandlingDropdown 
{
	public void selectOptions(WebElement element,Object value)
	{
		if(value instanceof Integer)
		{
		UtilityObjects.handleDropdown(element).selectByIndex((int)value);
		}
		else if (value instanceof String)
		{
			try {
			UtilityObjects.handleDropdown(element).selectByValue((String)value);
			}
			catch (Exception e) 
			{
				try {
				UtilityObjects.handleDropdown(element).selectByVisibleText((String)value);
				}
				catch (Exception e1) {
					UtilityObjects.handleDropdown(element).selectByContainsVisibleText((String)value);
				}
			}
		}
	}
	public void deselectOptions(WebElement element,Object value)
	{
		if(value instanceof Integer)
		{
			UtilityObjects.handleDropdown(element).deselectByIndex((int)value);
		}
		else if(value instanceof String)
		{
			try {
				UtilityObjects.handleDropdown(element).deselectByValue((String)value);
			} catch (Exception e) {
				UtilityObjects.handleDropdown(element).deSelectByContainsVisibleText((String)value);
			}
			finally {
				UtilityObjects.handleDropdown(element).deselectByVisibleText((String)value);
			}
		}
		else if (value.equals(null)) 
		{
			UtilityObjects.handleDropdown(element).deselectAll();
		}	
	}
}