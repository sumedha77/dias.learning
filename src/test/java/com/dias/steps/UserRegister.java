package com.dias.steps;

import org.testng.annotations.Test;

import com.dias.demoproj.Setup;

import com.dias.demoproj.constants.Register;

public class UserRegister extends Setup{
		@Test
		public void RegisterUser() throws Exception{
			Register R1= new Register(driver);
			R1.getRegister();
			
		}	
}
