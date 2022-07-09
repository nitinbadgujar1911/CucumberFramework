package com.vtiger.pages;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.vtiger.common.genericmethods;

public class LoginPage {
	
	private WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	
	@FindBy (name="user_name")
	WebElement userid;
	
	@FindBy (name="user_password")
	WebElement pass;
	
	@FindBy (name="Login")
	WebElement login;
	

	@FindBy (name="login_theme")
	WebElement logintheme;
	
	@FindBy (xpath="//img[@src = 'include/images/vtiger-crm.gif']")
	WebElement Logo;
	
	@FindBy (xpath="//td[contains (text(), '123You must specify a valid username and password.')]")
	WebElement errmesg;
	
	@FindBy (xpath="//strong[text()='User Log-in']")
	WebElement loginpage;
	
	
	
			
	
	public void login(String user, String pwd)
	{
		genericmethods.entervalue(driver, userid, user);
		genericmethods.entervalue(driver, pass,pwd);
		//genericmethods.clickelement(driver, login);

	}
	

	public void Verifyinvalidlogin(String user, String pwd)
	{
		genericmethods.entervalue(driver, userid, user);
		genericmethods.entervalue(driver, pass, pwd);
		//genericmethods.clickelement(driver, login);
		//genericmethods.checkdisplay(driver, errmesg);
	}
	
	public void LoginwithTheme(String user, String pwd, String themetext)
	{
		genericmethods.entervalue(driver, userid, user);
		genericmethods.entervalue(driver, pass, pwd);
		//genericmethods.selectbytext(driver, logintheme, themetext);
		//genericmethods.clickelement(driver, login);
		
	}
	
	public void VerifyLogo()
	{
		
		genericmethods.checkdisplay(driver, Logo);
	}
	public void VerifyErrorMesg()
	{
		
		genericmethods.checkdisplay(driver, errmesg);
	}
	
	public void VerifyLoginPage()
	{
		
		genericmethods.checkdisplay(driver, loginpage);
		//driver.findElement(By.xpath("//strong[text()='User Log-in']")).isDisplayed();
	}
	
	public void ClickLogin()
	{
		
		genericmethods.clickelement(driver, login);
		
	}
	

	
	
	

}
