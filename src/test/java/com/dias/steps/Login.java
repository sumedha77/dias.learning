package com.dias.steps;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import com.dias.demoproj.Setup;
import com.dias.demoproj.constants.LoginOR;

public class Login extends Setup{

	@Test
	public void logintest()
	{
	driver.findElement(LoginOR.MYACC_BTN).click();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.MILLISECONDS); 
	
	}
	
	
	
	
}
