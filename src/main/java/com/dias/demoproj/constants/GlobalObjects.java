package com.dias.demoproj.constants;

import org.openqa.selenium.By;

public class GlobalObjects {

	public static final By CHAT_WIG= By.xpath("//div[contains(@id,'widget-global')]//img");
	public static final By CHAT_WIG_FRAME= By.xpath("//*[@id='chat-widget-container']/iframe[contains(@name,'chat-widget')]']");
	public static final By SEARCH_FBOX= By.xpath("//*[@id='select2-drop-mask']/following-sibling::div/div/input");
	public static final By SEARCH_ABOX= By.xpath("//div[contains(@class,'select2-drop-active')]/ul/li/ul/li");
}
