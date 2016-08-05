package com.ee.config;

import java.util.Random;

import org.openqa.selenium.firefox.FirefoxDriver;

public abstract class AbstractDriver {
	
	public static FirefoxDriver driver = null;
	
	public static  void initialize() throws Exception{
		driver = new FirefoxDriver();
		driver.get("http://52.50.87.129:3001/");
	}
	
	public static void cleanUp() throws Exception{
		driver.quit();
	}
	
	 public static int randomNumber(int max){
		 Random random = new Random();
		 int randomNumber = random.nextInt(max - 1) + 1;
		 System.out.println("randomnumber generted : "+randomNumber );
		 return randomNumber;
		
	 }
}
