package com.day13.parallel.com;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class BrowserTest extends BaseTest{

	@Parameters({"browser"})
	@Test
	public void openWebsite(String browser)
	{
		System.out.println("Browser Name  :"+browser);
		driver=getDriver(browser);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.seleniumeasy.com/test/");
		
	}
}
