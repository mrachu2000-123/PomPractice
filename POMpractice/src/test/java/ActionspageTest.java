

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;
import com.ActiTime.base.BaseClass;
import com.ActiTime.pages.Actionspage;
import com.ActiTime.pages.AssignedUserspage;
import com.ActiTime.pages.CustandProjpage;
import com.ActiTime.pages.Detailspage;
import com.ActiTime.pages.Homepage;
import com.ActiTime.pages.Managerspage;
import com.ActiTime.pages.ReportedTimepage;
import com.ActiTime.pages.Taskpage;

public class ActionspageTest extends BaseClass {

	public ActionspageTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	Homepage homepage;

//	@Test
//	public void verifyProject() throws InterruptedException {
//		
//		homepage = Loginpage.login("admin", "manager");
//		
//	}
//	
//	@Test(priority = 1)
//	public void verifyTasks() throws InterruptedException {
//		
//		CustandProjpage cust = new CustandProjpage(driver);
//		cust.VerifyTask();
//	}
//	
//	@Test(priority = 2)
//	public void clickNasa() throws InterruptedException {
//
//		JavascriptExecutor jsc = (JavascriptExecutor) driver;
//		jsc.executeScript("window.scrollTo(0, 200)");
//		
//		try {
//			homepage.clickonNasa();
//		}
//
//		catch(Exception e) {
//
//			Taskpage task = new Taskpage(driver);
//			task.taskcreation();
//			homepage.clickonNasa();
//		}
//	}

	@Test(priority = 3)
	public void checkdetails() throws InterruptedException {

		Detailspage details = new Detailspage(driver);

		Thread.sleep(2000);
		details.clickstatus();

		details.clickdeadline();

		details.clickworktype();

		details.clickestimate();

		details.typedescription();

		details.typecomment();

		details.mouseoverdel();
	}

	@Test(priority = 4)
	public void reportedUser() throws InterruptedException {

		ReportedTimepage report = new ReportedTimepage(driver);
		report.clickreportedtime();

	}

	@Test(priority = 5)
	public void AssignedUser() throws InterruptedException {

		AssignedUserspage assign = new AssignedUserspage(driver);
		assign.clickassignedUsers();
	}

	@Test(priority = 6)
	public void Managers() throws InterruptedException {

		Managerspage manager = new Managerspage();
		manager.clickaddmanagers();
	}
	
	@Test(priority = 7)
	public void Actions() throws InterruptedException {
		
		Actionspage act = new Actionspage(driver);
		act.CopyTask();
		Thread.sleep(3000);
		act.MoveTask();
		Thread.sleep(3000);
		act.DeleteTask();
		
	}

}
