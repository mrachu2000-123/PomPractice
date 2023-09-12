package com.ActiTime.pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ActiTime.base.BaseClass;

public class CustandProjpage extends BaseClass{

	@FindBy(xpath="//a[@class='content tasks']")
	WebElement TaskTab;

	@FindBy(xpath="(//input[@placeholder='Start typing name ...'])[1]")
	WebElement TaskSearch;

//	@FindBy(xpath="(//div[@class='innerContainer'])[2]")
//	WebElement Content;
	
	@FindBy(xpath="//span[text()='Big']")
	WebElement Bigbang;
	
	@FindBy(xpath="//div[text()='view customer projects']")
	WebElement ViewDetails;

	@FindBy(xpath="(//div[text()='Flight operations'])[2]")
	WebElement Flight;		
	
	@FindBy(xpath="//div[text()='Add New']")
	WebElement AddNew;
	
//	@FindBy(xpath="//div[@class='item createNewCustomer']")
//	WebElement AddCustomer;
//	
//	@FindBy(xpath="//input[@class='inputFieldWithPlaceholder newNameField inputNameField']")
//	WebElement CreateCustomer;
//	
//	@FindBy(xpath="//textarea[@placeholder='Enter Customer Description']")
//	WebElement Description;
//	
//	@FindBy(xpath="//div[text()='Create Customer']")
//	WebElement CrtCustBtn;
	
	@FindBy(xpath="//div[@class='item createNewProject']")
	WebElement AddProject;
	
	@FindBy(xpath="//input[@class='projectNameField inputFieldWithPlaceholder inputNameField']")
	WebElement ProjectName;
	
	@FindBy(xpath="//div[text()='-- Please Select Customer to Add Project for  --']")
	WebElement Customerdrp;
	
	@FindBy(xpath="//div[contains(@class,'itemRow cpItemRow')][normalize-space()='Big Bang Company']")
	WebElement CustomerSelect;
	
	@FindBy(xpath="//textarea[@placeholder='Add Project Description']")
	WebElement Des;
	
	@FindBy(xpath="//div[text()='Create Project']")
	WebElement AddProjectBtn;
	
	@FindBy(xpath="//a[@class='content tt']")
	WebElement TimetrackTab;

	public CustandProjpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public Homepage VerifyTask() throws InterruptedException, IOException {

		TaskTab.click();
		Thread.sleep(2000);
		TaskSearch.sendKeys("Big Bang Company");
		Thread.sleep(2000);
		ViewDetails.click();
		Thread.sleep(3000);

		try {
		if((Bigbang.getText().equals("Big")) && (Flight.getText().equals("Flight operations"))) {
			TimetrackTab.click();
			Thread.sleep(2000);
	     	}
		}
		catch(Exception e) {
			
//			AddNew.click();
//			Thread.sleep(2000);
//			AddCustomer.click();
//			Thread.sleep(2000);
//			CreateCustomer.sendKeys("Big Bang Company");
//			Thread.sleep(2000);
//			Description.sendKeys("Big Bang is a consulting firm that helps organizations optimize"
//					+ " and streamline processes through planning digital strategy.");
//			Thread.sleep(2000);
//			JavascriptExecutor js = (JavascriptExecutor) driver;
//			js.executeScript("arguments[0].scrollIntoView();",CrtCustBtn);
//			Thread.sleep(2000);
//			CrtCustBtn.click();
//			Thread.sleep(3000);
//			
			AddNew.click();
			Thread.sleep(2000);
			AddProject.click();
			Thread.sleep(2000);
			ProjectName.sendKeys("Flight operations");
			Thread.sleep(2000);
			Customerdrp.click();
			Thread.sleep(2000);
			CustomerSelect.click();
			Thread.sleep(3000);
			Des.sendKeys("Flight operation process is a form of aircraft applications."
					+ " The optimization of flight process is the objective of flight operation.");
			Thread.sleep(2000);
			AddProjectBtn.click();
			Thread.sleep(2000);
			TimetrackTab.click();
			Thread.sleep(1000);
			
		}
		
		return new Homepage();
	}
}
