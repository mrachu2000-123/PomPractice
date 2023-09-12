package com.ActiTime.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ActiTime.base.BaseClass;

public class ReportedTimepage extends BaseClass {
	
	@FindBy(xpath="//div[@class='reportedTime']")
	WebElement Reportedtime;
	
	public ReportedTimepage(WebDriver d) {
		driver = d;
		PageFactory.initElements(driver,this);
	}

	public AssignedUserspage clickreportedtime() {
		Reportedtime.click();
		return new AssignedUserspage(driver);
	}

}
