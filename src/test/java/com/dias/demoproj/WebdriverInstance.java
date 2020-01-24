package com.dias.demoproj;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;


public class WebdriverInstance extends Setup{
	private String BaseURL="https://www.phptravels.net/";
	WebDriver driver;
	
	public WebdriverInstance(WebDriver driver) {
		driver.get(BaseURL);
		this.driver=driver;
		PageFactory.initElements(driver, this);  
	}

	
}
