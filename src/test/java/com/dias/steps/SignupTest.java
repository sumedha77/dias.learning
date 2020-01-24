package com.dias.steps;


import org.testng.annotations.Test;

import com.dias.demoproj.Setup;
import com.dias.demoproj.constants.LoginOR;

public class SignupTest extends Setup{
	@Test
	public void signUp() throws Exception{
		LoginOR l1= new LoginOR(driver);
		l1.signlogin();
		
	}	
	
	
	
	

	
	
}
