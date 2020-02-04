package com.dias.demoproj.constants;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.dias.demoproj.WebdriverInstance;

public class GlobalObjects extends WebdriverInstance {

	@FindBy(xpath="//div[contains(@class,'dropdown dropdown-login dropdown-tab')]") 
	private WebElement MYACC_BTN;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement SUBMIT;
	
	public GlobalObjects(WebDriver driver) throws Exception {
        super(driver);
	}
	
	/**
	 * @return the baseURL
	 */
	public WebElement getMYACC() {
		return this.MYACC_BTN;
	}

	/**
	 * @return the baseURL
	 */
	public WebElement getSubmit() {
		return this.SUBMIT;
	}	
	}
