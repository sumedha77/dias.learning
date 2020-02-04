package com.dias.demoproj;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;


public class WebdriverInstance extends Setup{
	private String BaseURL="https://www.phptravels.net/";
	protected WebDriver driver;
		
	public WebdriverInstance(WebDriver driver) {
		driver.get(BaseURL);
		driver.manage().timeouts().implicitlyWait(5000,TimeUnit.MILLISECONDS);
		this.driver=driver;
		PageFactory.initElements(driver, this);  
	}

	
}
