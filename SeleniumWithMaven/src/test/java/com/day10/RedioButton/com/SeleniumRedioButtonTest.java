package com.day10.RedioButton.com;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SeleniumRedioButtonTest extends BaseTest{

	private SeleniumRedioButtonPage objSeleniumRedioButtonPage;
	public void initializePageObject()
	{
		objSeleniumRedioButtonPage=new SeleniumRedioButtonPage(this);
	}
	
	@BeforeClass
	public void setUpWebEnvirnment()
	{
		this.initializePageObject();
		this.initilizeWebEnvirnment();
	}
	
	@Test(priority = 1)
	public void TC_01VerifyHeaderofRedioButtonDemoPage()
	{
		objSeleniumRedioButtonPage.verifyHeaderTextOfRedioButtonPageIsDisplayed();
	}
	@Test(priority = 2)
	public void TC_02VerifyRedioButtonDemoField()
	{
		objSeleniumRedioButtonPage.clickOnRedioButton("Female");
		objSeleniumRedioButtonPage.clickonGetCheckedValueButton();
		objSeleniumRedioButtonPage.checkResult();
	}
	
	@Test(priority = 3)
	public void TC03VerifyGroupRedioButtonDemoField()
	{
		objSeleniumRedioButtonPage.clickOnGroupRedioButtonsGender("Male");
		objSeleniumRedioButtonPage.clickOnGroupRedioButtonAge("5 - 15");
		objSeleniumRedioButtonPage.clickonGetValueButton();
		objSeleniumRedioButtonPage.checkGroutRedioResult();
	}
	
	public void TC03VerifyGroupButtonDemoField()
	{
		objSeleniumRedioButtonPage.clickOnGroupRedioButtonsGender("Male");
		objSeleniumRedioButtonPage.clickOnGroupRedioButtonAge("5 - 15");
		objSeleniumRedioButtonPage.clickonGetValueButton();
		objSeleniumRedioButtonPage.checkGroutRedioResult();
	}


}
