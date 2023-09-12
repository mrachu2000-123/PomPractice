package com.ActiTime.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ActiTime.base.BaseClass;

public class Taskpage extends BaseClass {
	
	@FindBy(xpath="//*[@id='addTaskButtonId']")
	WebElement NewTask;

	@FindBy(xpath="(//div[@class='dropdownButton'])[5]")
	WebElement Customerdrp ;

	@FindBy(xpath="//div[@class='comboboxButton focused']//input[@type='text']")
	WebElement CustomerTextBox;
	
	@FindBy(xpath="//div[normalize-space()='Big Bang Company']")
	WebElement Customer;

	@FindBy(xpath="(//div[@class='dropdownButton'])[6]")
	WebElement Projectdrp;

	@FindBy(xpath="//div[normalize-space()='Flight operations']")
	WebElement Project ;

	@FindBy(xpath="(//*[@class='inputFieldWithPlaceholder'])[1]")
	WebElement TaskName;

	@FindBy(xpath="//*[text()='Create Tasks']")
	WebElement TaskBtn;

	public Taskpage(WebDriver d) {
		driver = d;
		PageFactory.initElements(driver,this);
	}
	
	public void taskcreation() throws InterruptedException {
		
		NewTask.click();
		Thread.sleep(3000);

		Customerdrp.click();
		Thread.sleep(2000);
		
		WebElement comt = CustomerTextBox;
		Actions act = new Actions(driver);
		act.moveToElement(comt).click().
		keyUp(comt,Keys.SHIFT).sendKeys(comt,"Big Bang Company").
		build().perform();
		Thread.sleep(3000);

		Customer.click();
		Thread.sleep(3000);

		Projectdrp.click();
		Thread.sleep(3000);		
		
		Project.click();
		Thread.sleep(3000);

		TaskName.sendKeys("Nasa negotiation");
		Thread.sleep(3000);

		TaskBtn.click();
		Thread.sleep(3000);

		
		
	}

	
}
