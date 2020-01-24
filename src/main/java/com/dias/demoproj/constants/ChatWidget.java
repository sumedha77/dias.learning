package com.dias.demoproj.constants;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.dias.demoproj.WebdriverInstance;
import com.dias.utilities.CommonUtility;

public class ChatWidget extends WebdriverInstance {
	@FindBy(xpath="//div[contains(@id='widget-global')]//img]")
	private WebElement CHAT_WIG;
	@FindBy(xpath="//*[@id='chat-widget-container']/iframe[contains(@name,'chat-widget')]']")
	private WebElement CHAT_WIG_FRAME;
	@FindBy(name="chat-widget")
	private WebElement CHAT_WIG_IFRAME;
	
	public ChatWidget(WebDriver driver) throws Exception {
        super(driver);
    }
	
	public void chatwid() throws InterruptedException{
		CommonUtility.MoveToiFrame(this.CHAT_WIG_IFRAME);
		this.CHAT_WIG.click();
			
		}

	
}
