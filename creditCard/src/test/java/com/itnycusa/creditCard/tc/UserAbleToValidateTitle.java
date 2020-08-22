package com.itnycusa.creditCard.tc;

import static org.testng.Assert.assertEquals;
import org.testng.annotations.Test;

public class UserAbleToValidateTitle extends BaseTest{
	
	@Test
	public void userAbleToValidateTitle(){
		
		String title = driver.getTitle();
		assertEquals("AT&T Official Site - Unlimited Data Plans, Internet Service, & TV", title);
		driver.quit();
	}

}
