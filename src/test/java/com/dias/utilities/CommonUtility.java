package com.dias.utilities;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import com.dias.demoproj.Setup;
import com.dias.demoproj.constants.GlobalObjects;

public class CommonUtility extends Setup{
	
	static int[] WAIT={10,20,50,80};
	
	public static void MoveToiFrame(WebElement Locator) throws InterruptedException{
		driver.switchTo().frame(Locator);
		System.out.println("You are switched to iframe");
	}
	
	
	public static void Selectchkbox(WebDriver driver) throws InterruptedException{
	driver.findElement(GlobalObjects.CHKBOX_link).click();
	WebDriverWait wait=new WebDriverWait(driver, WAIT[1]);
	wait.until(ExpectedConditions.visibilityOfElementLocated(GlobalObjects.FOOTER));
	
	List <WebElement> chkbox =driver.findElements(GlobalObjects.CHKBOX);
	chkbox.size();
	
	for (WebElement we:chkbox) { 
    //simulate visual movement
		if(we.isSelected()){
			return;
		}
    we.click();
      }
	}
	
	
	public static void SelectDrpdown(WebDriver driver) throws InterruptedException{
		driver.findElement(GlobalObjects.DRPDOWN_link).click();
		WebDriverWait wait=new WebDriverWait(driver, WAIT[1]);
		wait.until(ExpectedConditions.visibilityOfElementLocated(GlobalObjects.FOOTER));
		
		driver.findElement(GlobalObjects.DRPDOWN).click();
		Select oSelect = new Select(driver.findElement(GlobalObjects.DRPDOWN));
		List <WebElement> elementCount = oSelect.getOptions();
		System.out.println(elementCount.size());
		//oSelect.selectByIndex(1);
		//oSelect.selectByValue("2");
		oSelect.selectByVisibleText("Option 1");
		driver.findElement(GlobalObjects.DRPDOWN).sendKeys(Keys.ESCAPE);
		
	}	
	
	public static void Imghover(WebDriver driver) throws InterruptedException{
		driver.findElement(GlobalObjects.HOVERS).click();
		WebDriverWait wait=new WebDriverWait(driver, WAIT[1]);
		wait.until(ExpectedConditions.visibilityOfElementLocated(GlobalObjects.FOOTER));
		
		Actions actions = new Actions(driver);
        //Retrieve WebElement 'Music' to perform mouse hover 
		WebElement IMGOption = driver.findElement(GlobalObjects.IMG_HOVER);
     //Mouse hover menuOption 'Music'
     actions.moveToElement(IMGOption).perform();
     System.out.println("Done Mouse hover on 'First Image' from Menu");
     String text= driver.findElement(GlobalObjects.IMG_TEXT).getText();
     System.out.println(text);
     
	}	
	public static void Dragndrop(WebDriver driver) throws InterruptedException{
		driver.findElement(GlobalObjects.DRAG_LINK).click();
		WebDriverWait wait=new WebDriverWait(driver, WAIT[1]);
		wait.until(ExpectedConditions.visibilityOfElementLocated(GlobalObjects.FOOTER));
		
		WebElement SourceElement= driver.findElement(GlobalObjects.SOURCE_ADD);
		WebElement TargetElement= driver.findElement(GlobalObjects.DEST_ADD);

		Actions action = new Actions(driver);
		action.dragAndDrop(SourceElement, TargetElement).build().perform();
		action.clickAndHold(SourceElement).moveToElement(TargetElement).release().build().perform();

		
		/*Actions action = new Actions(driver);
		WebElement SourceElement= driver.findElement(GlobalObjects.SOURCE_ADD);
		WebElement TargetElement= driver.findElement(GlobalObjects.DEST_ADD);
		
		Action seriesOfActions;
		seriesOfActions = action.clickAndHold(SourceElement)
				.moveByOffset(-1, -1)
			    .moveToElement(TargetElement, TargetElement.getLocation().getX()+TargetElement.getSize().getWidth()/2, TargetElement.getLocation().getY()+TargetElement.getSize().getHeight()/2)
			    .release(TargetElement)
			    .build();
		seriesOfActions.perform();
*/
		
		
		
	}	
}
	
		

	
	
	
	
	

