package com.vtiger.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.vtiger.common.genericmethods;

public class HeaderPage {

	private WebDriver driver;

	public HeaderPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy (linkText="Leads")
	WebElement lead;

	@FindBy (linkText="New Lead")
	WebElement newlead;

	@FindBy (linkText="Logout")
	WebElement logout;

	@FindBy (linkText="My Account")
	WebElement myaccount;

	public void clicklogout()
	{
		logout.click();
	}

	public void verifylogout()
	{
		
		genericmethods.checkdisplay(driver, logout);
	}

	public void clicklead()
	{
		genericmethods.clickelement(driver, lead);
	}

	public void clicknewlead()
	{

		genericmethods.clickelement(driver, newlead);
	}

	public void clickmyaccount()
	{
		genericmethods.clickelement(driver, myaccount);

	}



}

