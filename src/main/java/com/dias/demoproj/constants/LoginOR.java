package com.dias.demoproj.constants;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import com.dias.demoproj.WebdriverInstance;
import com.dias.demoproj.constants.GlobalObjects;
import com.dias.utilities.CommonUtility;
public class LoginOR extends WebdriverInstance {
	@FindBy(xpath="//div[contains(@class,'dropdown dropdown-login dropdown-tab')]") 
	private WebElement MYACC_BTN;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement SUBMIT;
	@FindBy(xpath="//*[@id='header-waypoint-sticky']//li[3]//a[contains(text(),'Login')]")
	private WebElement LOGIN;
	@FindBy(name="username")
	private WebElement USR_NM;
	@FindBy(name="password")
	private WebElement USR_PASS;
	

	public LoginOR(WebDriver driver) throws Exception {
        super(driver);
    }
	
	 public void signlogin() throws Exception{
		 		
	      	this.MYACC_BTN.click();
	      	Thread.sleep(500);
	      	this.LOGIN.click();
	       	this.USR_NM.clear();
	       	this.USR_NM.sendKeys("user@phptravels.com");
		 	this.USR_PASS.clear();
	        this.USR_PASS.sendKeys("demouser");
	        this.SUBMIT.click();
	        
	    }
	
	
}
