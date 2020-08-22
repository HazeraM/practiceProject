package com.itnycusa.creditCard.tc;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class UserAbleToValidateHeadBandComponents extends BaseTest{
	@Test
	public void userAbleToValidateHeadBandComponents() {
		
		WebElement deals = driver.findElement(By.cssSelector("#HEADBAND00 > span > a > span"));
		String dealsText = deals.getText();
		assertEquals("Deals", dealsText);
		
		WebElement phone_device = driver.findElement(By.cssSelector("#HEADBAND01 > span > a > span"));
		String phone_deviceText = phone_device.getText();
		assertEquals("Phones & devices", phone_deviceText);
		

	}

}
