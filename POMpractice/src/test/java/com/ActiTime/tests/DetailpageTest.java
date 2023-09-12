package com.ActiTime.tests;

import java.io.IOException;
import org.testng.annotations.Test;
import com.ActiTime.base.BaseClass;
import com.ActiTime.pages.Detailspage;
import com.ActiTime.pages.Homepage;

public class DetailpageTest extends BaseClass{

	public DetailpageTest() throws IOException {
		super();
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
//
//		try {
//
//			homepage.FindCount();
//			Thread.sleep(3000);
//
//			homepage.clickonNasa();
//			Thread.sleep(3000);
//
//		}
//
//		catch(Exception e) {
//
//			Taskpage task = new Taskpage(driver);
//			task.taskcreation();
//			Thread.sleep(3000);
//
//			homepage.FindCount();
//			Thread.sleep(3000);
//
//			homepage.clickonNasa();
//			Thread.sleep(3000);
//		}
//	}

	@Test(priority = 3)
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

}
