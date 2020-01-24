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
 


public class ChatWind extends Setup{
	
	@Test
	public void chat() throws Exception{
		ChatWidget c1= new ChatWidget(driver);
		c1.chatwid();
	}
	
	
}
