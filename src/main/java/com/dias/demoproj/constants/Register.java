package com.dias.demoproj.constants;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.dias.demoproj.WebdriverInstance;
import com.dias.utilities.CommonUtility;

public class Register extends WebdriverInstance {
	@FindBy(xpath="//div[contains(@class,'dropdown dropdown-login dropdown-tab')]") 
	private WebElement MYACC_BTN;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement SUBMIT;
	@FindBy(xpath="//*[@id='header-waypoint-sticky']//li[3]//a[contains(text(),'Sign Up')]")
	private WebElement SIGNUP;
	@FindBy(name="firstname")
	private WebElement FIRST_NM;
	@FindBy(name="lastname")
	private WebElement LAST_NM;
	@FindBy(name="phone")
	private WebElement PHONE;
	@FindBy(name="email")
	private WebElement EMAIL_ADD;
	@FindBy(name="password")
	private WebElement PASSWORD;
	@FindBy(name="confirmpassword")
	private WebElement CONF_PASSWORD;
	
	public Register(WebDriver driver) throws Exception {
        super(driver);
    }
	
	 public void getRegister() throws Exception{
		 	this.MYACC_BTN.click();
	      	Thread.sleep(500);
	      	this.SIGNUP.click();
	       	this.FIRST_NM.clear();
	     	this.FIRST_NM.sendKeys("Michelle");
	     	this.LAST_NM.clear();
	     	this.LAST_NM.sendKeys("Flintof");
	     	this.PHONE.clear();
	     	this.PHONE.sendKeys("9425026728");
	     	this.EMAIL_ADD.clear();
	     	this.EMAIL_ADD.sendKeys(CommonUtility.uniqueEmail()+"@test.com");
	     	Thread.sleep(500);
	     	System.out.println(EMAIL_ADD);
	     	this.PASSWORD.clear();
	        this.PASSWORD.sendKeys("demouser");
	        this.CONF_PASSWORD.clear();
	        this.CONF_PASSWORD.sendKeys("demouser");
	        this.SUBMIT.click();
	    }
	
	
	
}
