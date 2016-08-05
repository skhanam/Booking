package com.ee.Test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.ee.config.AbstractDriver;
import com.ee.pages.BookingPage;

public class BookingTest extends AbstractDriver{
	public FirefoxDriver driver;
	
	@Before
	public void setUp() throws Exception{
		AbstractDriver.initialize();
		
	}
	
	@Test
	public void someTest() throws InterruptedException{
		BookingPage bp = new BookingPage();
		bp.saveBooking();
	}
	
	@After
	public void tearDown(){
		AbstractDriver.driver.quit();
	}

}
