package com.vtiger.runner;

import java.io.FileInputStream;

import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {

	public static WebDriver driver;
	public Properties prop;
	

	
	public void launchApp() throws Exception
	{
		Readpropertis();
		if(prop.getProperty("Browser").equals("chrome"))
		{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		}
		else if(prop.getProperty("Browser").equals("edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		driver.get(prop.getProperty("AppUrl"));
		driver.manage().window().maximize();
		String s= prop.getProperty("GlobalTimeout");
		int n = Integer.parseInt(s);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(n));
	}

	
	public void CloseApp()
	{
		driver.quit();
	}
	
	public void Readpropertis() throws Exception
	{
		prop = new Properties();
		FileInputStream fis = new FileInputStream (System.getProperty("user.dir")+"/src/test/java/com/vtiger/common/config.properties");
		prop.load(fis);
		
	}
	



}
