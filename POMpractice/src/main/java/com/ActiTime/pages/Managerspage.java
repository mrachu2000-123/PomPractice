package com.ActiTime.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ActiTime.base.BaseClass;

public class Managerspage extends BaseClass{
	
	@FindBy(xpath="//div[@class='managers']")
	WebElement Managers;
	
	@FindBy(xpath="//div[text()='Add Managers']")
	WebElement AddManagers;
	
	@FindBy(xpath="(//span[@title='Nowak, Peter'])[2]")
	WebElement CheckboxSelect;
		
	@FindBy(xpath="(//span[text()='Close'])[2]")
	WebElement CloseButton;

	public void clickaddmanagers() throws InterruptedException {
		Managers.click();
		Thread.sleep(3000);
		AddManagers.click();
		Thread.sleep(3000);
		Actions act = new Actions(driver);
		act.sendKeys(Keys.DOWN).sendKeys("Peter").build().perform();
		Thread.sleep(3000);
		CheckboxSelect.click();
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();",CloseButton);
		Thread.sleep(3000);
		CloseButton.click();
		Thread.sleep(3000);

	}
}
