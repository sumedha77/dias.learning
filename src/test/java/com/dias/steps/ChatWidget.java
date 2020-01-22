package com.dias.steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.dias.demoproj.Setup;
import com.dias.demoproj.constants.*;
 


public class ChatWidget extends Setup{
	
	@Test
	public void chat() throws InterruptedException{
		
	chatwid(getDriver());
	}
	
	public void chatwid(WebDriver driver) throws InterruptedException{
	driver.switchTo().frame("chat-widget");
	WebDriverWait wait=new WebDriverWait(driver, 50);
	wait.until(ExpectedConditions.visibilityOfElementLocated(GlobalObjects.CHAT_WIG));
	driver.findElement(GlobalObjects.CHAT_WIG).click();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.MILLISECONDS);
	
	}
}
