package com.ActiTime.tests;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.ActiTime.base.BaseClass;
import com.ActiTime.pages.CustandProjpage;
import com.ActiTime.pages.Homepage;
import com.ActiTime.pages.Loginpage;
import com.ActiTime.pages.Taskpage;

public class HomepageTest extends BaseClass{

	Homepage homepage;
	Loginpage loginpage;

	public HomepageTest() throws IOException {
		super();
	}

	@BeforeMethod
	public void setup() throws InterruptedException, IOException {
		initialization();
		loginpage = new Loginpage();
		homepage = loginpage.login("admin", "manager");
	}


	@Test(priority = 1)
	public void verifyTasks() throws InterruptedException, IOException {

		CustandProjpage cust = new CustandProjpage(driver);
		cust.VerifyTask();
	}

	@Test(priority = 2)
	public void clickNasa() throws InterruptedException {

		JavascriptExecutor jsc = (JavascriptExecutor) driver;
		jsc.executeScript("window.scrollTo(0, 200)");

		try {
			homepage.clickonNasa();
		}

		catch(Exception e) {

			Taskpage task = new Taskpage(driver);
			task.taskcreation();
			homepage.clickonNasa();
		}
	}
	//C:\Users\rachanam\Downloads
}

