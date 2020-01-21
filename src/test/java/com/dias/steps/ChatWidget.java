package com.dias.steps;

import org.openqa.selenium.By;


import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.dias.demoproj.Setup;
import com.dias.demoproj.constants.*;
 


public class ChatWidget extends Setup{
	
	@Test
	public void chatwid() throws InterruptedException{
	int size = driver.findElements(By.tagName("iframe")).size();	
	System.out.println("hello" + size);
	driver.findElement(By.xpath("//*[@id='chat-widget-container']"));
	//driver.switchTo().frame(1);
	driver.switchTo().frame("chat-widget");
	WebDriverWait wait=new WebDriverWait(driver, 50);
	wait.until(ExpectedConditions.visibilityOfElementLocated(GlobalObjects.CHAT_WIG));
	driver.findElement(GlobalObjects.CHAT_WIG).click();
	
	}
}
