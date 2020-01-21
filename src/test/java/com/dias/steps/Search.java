package com.dias.steps;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.dias.demoproj.Setup;
import com.dias.demoproj.constants.GlobalObjects;

public class Search extends Setup{
	
		@Test
		public void search() throws InterruptedException{
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='cookyGotItBtnBox']/div/button")).click();
		driver.findElement(By.xpath("//*[@id='s2id_autogen8']/a/span[1]")).click();
		driver.findElement(GlobalObjects.SEARCH_FBOX).sendKeys("new");
		Thread.sleep(1000);
		//WebElement ADropDown = driver.findElement(GlobalObjects.SEARCH_ABOX);
		List <WebElement> allOptions=driver.findElements(GlobalObjects.SEARCH_ABOX);
		System.out.println(allOptions);
			for ( WebElement we: allOptions) { 
	         //simulate visual movement
	        if ( we.getText().contains("New Delhi" )) {
	        	System.out.println("Match found");
	        	we.click();
	        return;	
	        }
		}
	}
}
