package com.ee.pageobjects;

import org.bouncycastle.crypto.prng.RandomGenerator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.ee.config.AbstractDriver;

public class BookingPageObject {
	
	@FindBy(id = "firstname")
	public WebElement fName;
	
	@FindBy(id = "lastname")
	public WebElement lName;
	
	@FindBy(id = "totalprice")
	public WebElement tPrice;
	
	@FindBy(id = "depositpaid")
	public WebElement deposit;
	
	@FindBy(id = "checkin")
	public WebElement sDate;
	
	@FindBy(id = "checkout")
	public WebElement eDate;
	
	@FindBy(xpath = ".//*[@id='ui-datepicker-div']/div/a[2]")
	public WebElement nxtMonth;
	
	public String formxpath = ".//*[@id='ui-datepicker-div']/table/tbody/tr["+AbstractDriver.randomNumber(5)+"]/td["+AbstractDriver.randomNumber(7)+"]";
	
	@FindBy(xpath = ".//*[@value='save']")
	public WebElement save;
	
	@FindBy(xpath = ".//*[@value='Delete']")
	public WebElement delete;
	
	
	
}
