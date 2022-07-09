package com.vtiger.stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.vtiger.pages.HomePage;
import com.vtiger.pages.LoginPage;
import com.vtiger.runner.BaseTest;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;



public class LoginTestStep extends BaseTest {
	public static WebDriver driver;
	public LoginPage lp;
	public HomePage hp;


	@Given("^user navigate to url \"([^\"]*)\"$")
	public void user_navigate_to_url(String url) throws Throwable {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
	}

	@Then("^Login page should appear$")
	public void login_page_should_appear() throws Throwable {
		lp= new LoginPage(driver);
		hp = new HomePage(driver);
		lp.VerifyLoginPage();



	}

	@When("^User enters invalid login as \"([^\"]*)\" and passward as \"([^\"]*)\"$")
	public void user_enters_invalid_login_as_and_passward_as(String userid, String passward) throws Throwable {
		driver.findElement(By.name("user_name")).sendKeys(userid);
		driver.findElement(By.name("user_password")).sendKeys(passward);
		
	    
	}

	@Then("^click in Login Button$")
	public void click_in_Login_Button() throws Throwable {
		lp.ClickLogin();

	}

	@Then("^user should be landed on Home page$")
	public void user_should_be_landed_on_Home_page() throws Throwable {

		hp.VerifyHomePage();



	}

	@Then("^click logout link$")
	public void click_logout_link() throws Throwable {
		hp.clicklogout();
	}
	

		@When("^User enters invalid login and passward$")
		public void user_enters_invalid_login_and_inpassward() throws Throwable {
			lp.Verifyinvalidlogin("admin", "admin123");

		}

		@Then("^verify login error mesg$")
		public void verify_login_error_mesg() throws Throwable {
			driver.findElement(By.xpath("//td[contains (text(), 'You must specify a valid username and password.')]")).isDisplayed();

		}



	@Then("^close the browser$")
	public void close_the_browser() throws Throwable {
		driver.quit();

	}

}
