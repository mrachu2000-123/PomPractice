package com.ActiTime.tests;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ActiTime.base.BaseClass;
import com.ActiTime.pages.Homepage;
import com.ActiTime.pages.Loginpage;

public class LoginpageTest extends BaseClass  {
	
	Loginpage loginpage;
	Homepage homepage;
	
	public LoginpageTest() throws IOException {
		super();
	}
	
	@Test
	public void setup() throws IOException {
		initialization();
		loginpage = new Loginpage();
	}
	
	
	@Test(priority =1)
	public void logintest() throws InterruptedException, IOException {
		
	homepage=loginpage.login(prop.getProperty("username"),prop.getProperty("password"));
	
	}

}
