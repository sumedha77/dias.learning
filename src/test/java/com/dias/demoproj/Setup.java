package com.dias.demoproj;

import org.testng.annotations.*;

import com.dias.demoproj.constants.LoginOR;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Setup{
	/**
	 * @author Sumedha
	 * Class to provide driver
	 *
	 */
	private static WebDriver driver;
	public static final String CHROME_WEBDRIVE_PROPERTY_KEY="webdriver.chrome.driver";
	public static final String FIREFOX_WEBDRIVE_PROPERTY_KEY="webdriver.gecko.driver";
	public static final String CHROME_WEBDRIVE_PROPERTY_VALUE="\\MYREPO\\dias.learning\\src\\resources\\test\\chromedriver.exe";
	public static final String FIREFOX_WEBDRIVE_PROPERTY_VALUE="C:\\Program Files\\Mozilla Firefox\\firefox.exe";
	
	@BeforeSuite
	public  static void setDriver() throws Exception {
		
		System.setProperty(CHROME_WEBDRIVE_PROPERTY_KEY,
			CHROME_WEBDRIVE_PROPERTY_VALUE);
		System.out.println(System.getProperty(CHROME_WEBDRIVE_PROPERTY_KEY));
	 driver = new ChromeDriver();
	 driver.manage().deleteAllCookies();
	 driver.get("http://the-internet.herokuapp.com/");
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(50,TimeUnit.MILLISECONDS);
	 }
	
	
	/**
	*After Suite
	*//*
	@AfterSuite
	public  void afterClass() {
	driver.quit();
	}*/
	
	public WebDriver getDriver(){
		return driver;
	}
	
	
	
}