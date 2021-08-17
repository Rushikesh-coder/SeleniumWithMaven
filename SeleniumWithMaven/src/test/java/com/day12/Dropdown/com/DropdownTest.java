package com.day12.Dropdown.com;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DropdownTest extends BaseTest {

	private SelectDropDown objSelectDropDown;

	public void initializePageObject() {
		objSelectDropDown = new SelectDropDown(this);
	}

	@BeforeClass
	public void initalizeWebEnvirnmentSetUp() {
		this.initializePageObject();
		this.initilizeWebEnvirnment();
	}

	@Test(priority = 1)
	public void TC_01VerifyHeaderOfPage() {
		objSelectDropDown.checkPegeHeaderIsDisplayed();
	}
	
	@Test(priority = 2)
	public void TC_VerifyTextAndSelectSingleDropdown()
	{
		objSelectDropDown.verifySelectListDemoText("Select List Demo", objConfig.getProperty("SingleListText"));
		objSelectDropDown.getDefalultSelectedItem();
		objSelectDropDown.selectValueFromDropDown(objConfig.getProperty("DropDownSingleDay"));
		
	}
	
	@Test(priority = 3)
	public void TC_VerifySelectedValueOfSingleDropDown()
	{
		objSelectDropDown.getselectedValue("selected-value");
	}
	
	@Test(priority = 4)
	public void TC_VerifyTextAndSelectMultipleDropdowns()
	{
		objSelectDropDown.verifySelectListDemoText("Multi Select List Demo",objConfig.getProperty("MultiListText"));
		objSelectDropDown.selectMultipleValuesDropDown(objConfig.getProperty("DropDownValue1st"),
				objConfig.getProperty("DropDownValue2nd"),
				objConfig.getProperty("DropDownValue3rd"));
		objSelectDropDown.clickOnGetAllSelectedButton();
		objSelectDropDown.getselectedValue("getall-selected");
	}
	
	@AfterClass
	public void tearDown()
	{
		this.tearDownEnvirnment();
	}
}
