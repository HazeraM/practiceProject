package com.itnycusa.creditCard.tc;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class BaseTest {
	
	public WebDriver driver;
	
	@BeforeClass
	public void BeforeClass(){
		String baseDir = System.getProperty("user.dir");
		String browserDriver = baseDir + "/browserDriver/chromedriver";
		
		System.setProperty("webdriver.chrome.driver", browserDriver);
		driver = new ChromeDriver();
		
	}
	
	@BeforeMethod
	public void beforeMethod() throws InterruptedException {
		driver.navigate().to("https://www.att.com/");
		Thread.sleep(2000);
		
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("Method is passing!");
		
	}
	
	@AfterClass
	public void AfterClass(){
		driver.quit();
		
	}

}
