package com.dias.demoproj.constants;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.dias.demoproj.WebdriverInstance;

public class LoginOR extends WebdriverInstance {
	@FindBy(xpath="//div[contains(@class,'dropdown dropdown-login dropdown-tab')]")
	private WebElement MYACC_BTN;
	@FindBy(xpath="//*[@id='header-waypoint-sticky']//li[3]//a[contains(text(),'Login')]")
	private WebElement LOGIN;
	@FindBy(name="username")
	private WebElement USR_NM;
	@FindBy(name="password")
	private WebElement USR_PASS;
	@FindBy(xpath="//button[@type='submit']")
	private WebElement SUBMIT;
	
	public LoginOR(WebDriver driver) throws Exception {
        super(driver);
    }
	
	 public void signlogin() throws InterruptedException{
		 	this.MYACC_BTN.click();
	       	this.LOGIN.click();
	       	this.USR_NM.clear();
	       	this.USR_NM.sendKeys("user@phptravels.com");
		 	this.USR_PASS.clear();
	        this.USR_PASS.sendKeys("demouser");
	        this.SUBMIT.click();
	        
	    }
	
	
}
