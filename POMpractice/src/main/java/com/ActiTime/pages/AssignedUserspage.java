package com.ActiTime.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.ActiTime.base.BaseClass;

public class AssignedUserspage extends BaseClass{

	@FindBy(xpath="//div[@class='assignedUsers']")
	WebElement Assigned;
	
	@FindBy(xpath="//div[text()='Assign']")
	WebElement AssignTaskBtn;
	
	@FindBy(xpath="//div[@class='treeContainer filtered hideDisabled']")
	WebElement AssignTask;
	
	@FindBy(xpath="//span[@title='Ramirez, Maria']")
	WebElement CheckboxSelect;
	
	@FindBy(xpath="//*[@class=' x-btn greyButton close-button']")
	WebElement CloseBtn;
	
	@FindBy(xpath="//div[@class='deleteIcon']")
	WebElement DeleteAssTask;
	
	public AssignedUserspage(WebDriver d) {
		driver = d;
		PageFactory.initElements(driver,this);
	}
	
	public void clickassignedUsers() throws InterruptedException {
		Assigned.click();
		Thread.sleep(3000);
		AssignTaskBtn.click();
		Thread.sleep(3000);
		Actions act = new Actions(driver);
		act.sendKeys(Keys.DOWN).sendKeys("Maria").build().perform();
		Thread.sleep(3000);
		CheckboxSelect.click();
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();",CloseBtn);
		Thread.sleep(3000);
		CloseBtn.click();
		Thread.sleep(3000);
		DeleteAssTask.click();
		Thread.sleep(3000);

	}
}
