package com.vtiger.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.vtiger.common.genericmethods;

public class LeadPage extends HeaderPage {
	
private WebDriver driver;
	
	public LeadPage(WebDriver driver)
	{
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (name="lastname")
	WebElement Lastname;
	
	@FindBy (name="company")
	WebElement companyname;
	
	@FindBy (name="button")
	WebElement savebtn;
	
	@FindBy (name="Edit")
	WebElement Editbtn; 
	
	
	
	
	public void Createleadwithmondatoryfields(String lastname, String compname)
	{
		genericmethods.entervalue(driver, Lastname, lastname);
		genericmethods.entervalue(driver, companyname, compname);
		genericmethods.clickelement(driver, savebtn);
		genericmethods.checkdisplay(driver, Editbtn);
		
	}
	
	

}
