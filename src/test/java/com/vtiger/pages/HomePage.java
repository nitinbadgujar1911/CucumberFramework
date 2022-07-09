package com.vtiger.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.vtiger.common.genericmethods;

public class HomePage extends HeaderPage{
	
private WebDriver driver;
	
	public HomePage(WebDriver driver)
	{
		super(driver);
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
	}
	

	@FindBy (xpath="//td[contains(text(),'My Tickets')]")
	WebElement myticket;
	
	public void VerifyHomePage()
	{
		
		genericmethods.checkdisplay(driver, myticket);
		
	}
	

}
