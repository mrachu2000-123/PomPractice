package com.ActiTime.tests;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;
import com.ActiTime.base.BaseClass;
import com.ActiTime.pages.AssignedUserspage;
import com.ActiTime.pages.Detailspage;
import com.ActiTime.pages.Homepage;
import com.ActiTime.pages.Managerspage;
import com.ActiTime.pages.ReportedTimepage;
import com.ActiTime.pages.Taskpage;

public class ManagerspageTest extends BaseClass{
	
	public ManagerspageTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	Homepage homepage;

//	@Test(priority = 1)
//	public void clickNasa() throws InterruptedException {
//
//		homepage = Loginpage.login("admin", "manager");
//		Thread.sleep(3000);
//
//		JavascriptExecutor jsc = (JavascriptExecutor) driver;
//		jsc.executeScript("window.scrollTo(0, 200)");
//		Thread.sleep(3000);
//
//		try {
//			homepage.clickonNasa();
//			Thread.sleep(3000);
//		}
//
//		catch(Exception e) {
//
//			Taskpage task = new Taskpage(driver);
//			task.taskcreation();
//			Thread.sleep(3000);
//			homepage.clickonNasa();
//			Thread.sleep(3000);
//		}
//	}

	@Test(priority = 2)
	public void checkdetails() throws InterruptedException {

		Detailspage details = new Detailspage(driver);

		Thread.sleep(2000);
		details.clickstatus();
		Thread.sleep(3000);

		details.clickdeadline();
		Thread.sleep(3000);

		details.clickworktype();
		Thread.sleep(3000);

		details.clickestimate();
		Thread.sleep(3000);

		details.typedescription();
		Thread.sleep(3000);

		details.typecomment();
		Thread.sleep(3000);

		details.mouseoverdel();
		Thread.sleep(3000);
	}

	@Test(priority = 3)
	public void reportedUser() throws InterruptedException {

		ReportedTimepage report = new ReportedTimepage(driver);
		report.clickreportedtime();
		Thread.sleep(3000);

	}
	
	@Test(priority = 4)
	public void AssignedUser() throws InterruptedException {

		AssignedUserspage assign = new AssignedUserspage(driver);
		assign.clickassignedUsers();
		Thread.sleep(3000);
	}
	
	 @Test(priority = 5)
	public void Managers() throws InterruptedException {

		Managerspage manager = new Managerspage();
		manager.clickaddmanagers();
		Thread.sleep(3000);
	}

}
