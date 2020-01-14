package com.dias.demoproj;

import org.testng.annotations.*;

import com.dias.demoproj.constants.LoginOR;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Setup {
		/**
	 * @author Sumedha
	 * Class to provide driver
	 *
	 */
	
	public static final String CHROME_WEBDRIVE_PROPERTY_KEY="webdriver.chrome.driver";
//	public static final String FIREFOX_WEBDRIVE_PROPERTY_KEY="webdriver.firefox.bin";
//	public static final String IE_WEBDRIVE_PROPERTY_KEY="webdriver.ie.driver";

	public static final String CHROME_WEBDRIVE_PROPERTY_VALUE="\\MYREPO\\dias.learning\\src\\resources\\test\\chromedriver.exe";
//	public static final String FIREFOX_WEBDRIVE_PROPERTY_VALUE="C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe";
//	public static final String IE_WEBDRIVE_PROPERTY_VALUE="\\chromedriver_win32\\IEDriverServer.exe";
//	
	public WebDriver driver = null;
	@BeforeSuite
	public  void getDriver() throws Exception {
		
		System.setProperty(CHROME_WEBDRIVE_PROPERTY_KEY,
				CHROME_WEBDRIVE_PROPERTY_VALUE);
		System.out
				.println(System.getProperty(CHROME_WEBDRIVE_PROPERTY_KEY));
	 driver = new ChromeDriver();
	 driver.get("https://www.phptravels.net/");
	 driver.manage().window().maximize();
	 //driver.manage().timeouts().implicitlyWait(50,TimeUnit.MILLISECONDS); 
	 WebDriverWait wait=new WebDriverWait(driver, 20);
	 wait.until(ExpectedConditions.visibilityOfElementLocated(LoginOR.MYACC_BTN));
	 	
	}

	
}
