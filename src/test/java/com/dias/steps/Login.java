package com.dias.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import com.dias.demoproj.Setup;
import com.dias.demoproj.constants.LoginOR;

public class Login extends Setup{

	@Test
	public void logintest(WebDriver driver)
	{
	driver.findElement(LoginOR.MYACC_BTN).click();
	//driver.manage().timeouts().implicitlyWait(10,TimeUnit.MILLISECONDS); 
	
	}
	

	
	
}
