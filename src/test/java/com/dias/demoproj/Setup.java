package com.dias.demoproj;

import org.testng.annotations.*;

import java.io.FileReader;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

import org.apache.commons.exec.util.StringUtils;
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
	protected static WebDriver driver;
	public static final String CHROME_WEBDRIVE_PROPERTY_KEY="webdriver.chrome.driver";
	public static final String FIREFOX_WEBDRIVE_PROPERTY_KEY="webdriver.gecko.driver";
	public static final String CHROME_WEBDRIVE_PROPERTY_VALUE="\\MYREPO\\dias.learning\\src\\resources\\test\\chromedriver.exe";
	public static final String FIREFOX_WEBDRIVE_PROPERTY_VALUE="C:\\Program Files\\Mozilla Firefox\\firefox.exe";
	
	
	@BeforeSuite
	public static void setDriver() throws Exception {
		
		System.setProperty(CHROME_WEBDRIVE_PROPERTY_KEY,
			CHROME_WEBDRIVE_PROPERTY_VALUE);
		System.out.println(System.getProperty(CHROME_WEBDRIVE_PROPERTY_KEY));
	 driver = new ChromeDriver();
	 driver.manage().deleteAllCookies();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
	 }
	
	
	/**
	*After Suite
	*//*
	@AfterSuite
	public  void afterClass() {
	driver.quit();
	}*/
	
	
	
	
	
}