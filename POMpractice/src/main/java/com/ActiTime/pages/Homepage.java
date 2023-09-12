package com.ActiTime.pages;

import java.io.IOException;
import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ActiTime.base.BaseClass;

public class Homepage extends BaseClass {

	public int r;

	@FindBy(xpath="(//div[text()='Nasa negotiation'])[1]")
	WebElement NasaNegotiation;

//	@FindBy(xpath="//tbody[@id='actualTTRows']/tr")
//	List<WebElement> RowCount;
	
	public Homepage() throws IOException {
		super();
		PageFactory.initElements(driver, this);
	}
	
//	public void FindCount() {
//		
//		List<WebElement> rows = RowCount; 
//	    r = rows.size();
//		System.out.println(r);
//	}
	
	public Detailspage clickonNasa() throws InterruptedException {
		
		Thread.sleep(3000);
		NasaNegotiation.click();

		return new Detailspage(driver);
		
	}

}
