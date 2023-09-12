package com.ActiTime.tests;

import java.io.IOException;

import org.testng.annotations.Test;
import com.ActiTime.base.BaseClass;
import com.ActiTime.pages.Homepage;
import com.ActiTime.pages.Integrationpage;
import com.ActiTime.pages.LeaveManagementpage;

public class IntegrationpageTest extends BaseClass{
	
	public IntegrationpageTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}


	Homepage homepage;

	
	@Test(priority = 1)
	public void clickIntegration() throws InterruptedException {
		
		Integrationpage integ = new Integrationpage(driver);
		integ.IntegrationTab();
		integ.Search("Maria");
		integ.selectUser();
		integ.Alluser();
		integ.ClickRequest();
	}


	@Test(priority = 2)
	public void clickLeaveManagement() throws InterruptedException {
		
		LeaveManagementpage leave = new LeaveManagementpage(driver);
		leave.leavemanage();
	}
	
}