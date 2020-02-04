package com.dias.demoproj;

import org.testng.annotations.*;

/*import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.util.Properties;*/
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class Setup{
	/**
	 * @author Sumedha
	 * Class to provide driver
	 *
	 */
	protected static WebDriver driver;
	public static final String CHROME_WEBDRIVE_PROPERTY_KEY="webdriver.chrome.driver";
	public static final String FIREFOX_WEBDRIVE_PROPERTY_KEY="webdriver.gecko.driver";
	public static final String CHROME_WEBDRIVE_PROPERTY_VALUE="\\MYREPO\\dias.learning\\src\\resources\\test\\chromedriver.exe";
	public static final String FIREFOX_WEBDRIVE_PROPERTY_VALUE="\\MYREPO\\dias.learning\\src\\resources\\test\\geckodriver.exe";
	public static final String IE_WEBDRIVE_PROPERTY_KEY ="webdriver.ie.driver";
	public static final String IE_WEBDRIVE_PROPERTY_VALUE ="\\chromedriver_win32\\IEDriverServer.exe";
	public static final String PROP_PATH="\\MyREPO\\dias.learning\\configuration.property";
	
	@Parameters({"browser"})
	@BeforeTest
	public static void setDriver(String browser) throws Exception {
		/*PropertyOperations prop = new PropertyOperations();
		String	browserName = prop.getPropertyKey("browserName");*/
		System.out.println(browser);
		
		if(browser.equalsIgnoreCase("chrome")){
		System.setProperty(CHROME_WEBDRIVE_PROPERTY_KEY,
			CHROME_WEBDRIVE_PROPERTY_VALUE);
		System.out.println(System.getProperty(CHROME_WEBDRIVE_PROPERTY_KEY));
		driver = new ChromeDriver();
		}
		else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty(FIREFOX_WEBDRIVE_PROPERTY_KEY,
					FIREFOX_WEBDRIVE_PROPERTY_VALUE);
			System.out.println("Firefox block");
			driver = new FirefoxDriver();
		} else {
			System.setProperty(IE_WEBDRIVE_PROPERTY_KEY,
					IE_WEBDRIVE_PROPERTY_VALUE);
			driver = new InternetExplorerDriver();
		}
	 driver.manage().deleteAllCookies();
	 driver.manage().window().maximize();
	 
	 }
	
	
//	/**
//	*After Suite
//	*//*
//	@AfterSuite
//	public  void afterClass() {
//	driver.quit();
//	}*/
	
	
	
	
	
}