package com.dias.demoproj.constants;

import org.openqa.selenium.By;

public class GlobalObjects {

	
	public static final By SEARCH_FBOX= By.xpath("//*[@id='select2-drop-mask']/following-sibling::div/div/input");
	public static final By SEARCH_ABOX= By.xpath("//div[contains(@class,'select2-drop-active')]/ul/li/ul/li");
	
	/*Locators for demo app/*
	 * 
	 */
	public static final By CHKBOX_link=By.cssSelector("#content > ul > li:nth-child(6) > a");
	public static final By CHKBOX=By.xpath("//*[@id='checkboxes']/input");
	public static final By FOOTER= By.xpath("//*[@id='page-footer']//a[contains(text(),'Elemental Selenium')]");
	public static final By DRPDOWN_link=By.xpath("//a[contains(text(),'Dropdown')]");
	public static final By DRPDOWN=By.xpath("//*[@id='dropdown']");
	public static final By DRAG_LINK=By.xpath("//a[contains(text(),'Drag and Drop')]");
	public static final By SOURCE_ADD=By.xpath("//*[@id='column-a']");
	public static final By DEST_ADD=By.xpath("//*[@id='column-b']");
	public static final By HOVERS=By.xpath("//a[contains(text(),'Hovers')]");
	public static final By IMG_HOVER=By.xpath("//*[@id='content']/div/div[1]/img");
	public static final By IMG_TEXT=By.xpath("//*[@id='content']/div/div[1]/div/h5");
			}
