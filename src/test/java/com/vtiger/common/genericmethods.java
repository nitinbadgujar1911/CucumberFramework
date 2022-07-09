package com.vtiger.common;



import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class genericmethods {

	public static void entervalue(WebDriver driver, WebElement elm, String data)
	{
		try
		{
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
			wait.until(ExpectedConditions.visibilityOf(elm));
			elm.clear();
			elm.sendKeys(data);
			if (elm.getAttribute("value").equals(data))
			{
				System.out.println("PASS");
			}
			else
			{
				System.out.println("FAILED");
			}
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	
	public static void clickelement(WebDriver driver, WebElement elm)
	{
		try
		{
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
			wait.until(ExpectedConditions.elementToBeClickable(elm));
			elm.click();
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	
	public static void selectbytext(WebDriver driver, WebElement elm, String data)
	{
		try
		{
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
			wait.until(ExpectedConditions.elementToBeSelected(elm));
			Select s = new Select(elm);
			s.selectByVisibleText(data);
			if (s.getFirstSelectedOption().getText().equals(data))
			{
				System.out.println("PASS");
			}
			else
			{
				System.out.println("FAILED");
			}
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	
	public static void checkdisplay(WebDriver driver, WebElement elm)
	{
		try
		{
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
			wait.until(ExpectedConditions.visibilityOf(elm));
			elm.isDisplayed();
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}


}
