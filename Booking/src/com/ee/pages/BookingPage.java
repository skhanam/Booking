package com.ee.pages;

import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.ee.config.AbstractDriver;
import com.ee.pageobjects.BookingPageObject;

public class BookingPage  extends AbstractDriver{
	BookingPageObject bpo = new BookingPageObject();
	static String FNAME = "test"+System.currentTimeMillis();
	
	
	
	 public BookingPage( ) {
	 	        PageFactory.initElements(driver,bpo);
	    }
	 
	 public void saveBooking() throws InterruptedException{
		 Assert.assertTrue("Hotel booking form", true);
		 bpo.fName.sendKeys(FNAME);
		 bpo.lName.sendKeys("lname");
		 bpo.tPrice.sendKeys("20");
		 selectOption("false");
		 bpo.sDate.click();
		 sdatepicker();
		 bpo.eDate.click();
		 edatepicker();
		 JavascriptExecutor js =  ((JavascriptExecutor)driver);
		 js.executeScript("createBooking()");
		 driver.navigate().refresh();
		 Assert.assertTrue(FNAME, true);
		 deleteEntries();
		
				
	 }
	
	 
	 public void sdatepicker(){
		 bpo.nxtMonth.click();	
		 driver.findElement(By.xpath(bpo.formxpath)).click();
	 }
	 
	 public void edatepicker(){
		 bpo.nxtMonth.click();	
		 bpo.nxtMonth.click();	
		 driver.findElement(By.xpath(bpo.formxpath)).click();
	 }


	public void deleteEntries() throws InterruptedException{
		 driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		 @SuppressWarnings("unchecked")
		 List<WebElement> rows = driver.findElements(By.xpath(".//*[@value='Delete']"));
			for(WebElement ele :rows)
		    {
		        System.out.println("Rows are :"+rows.size());
		        ele.click();
		    }
		  
	 }
	 
	 
	 public void selectOption(String choice){
		 WebElement select = bpo.deposit;
		    List<WebElement> options = select.findElements(By.tagName("option"));
		    for(WebElement option : options){
		        if(option.getText().equals(choice)) {
		            option.click();
		            break;
		        }
		    }
	 }
	 
	 
	 
	 
}
