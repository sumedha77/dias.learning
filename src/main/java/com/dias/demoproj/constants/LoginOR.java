package com.dias.demoproj.constants;

import org.openqa.selenium.By;

public class LoginOR {
	public static final By MYACC_BTN= By.cssSelector("#header-waypoint-sticky  li:nth-child(3) > div");
	public static final By LOGIN_BTN= By.xpath("//*[@id='header-waypoint-sticky']//a[contains(text(),'Login')]");
	public static final By USR_NM= By.name("username");
	public static final By PASSWORD= By.name("password");
	public static final By SUBMIT_BTN= By.xpath("//button[@type='submit']");
	
	
}
