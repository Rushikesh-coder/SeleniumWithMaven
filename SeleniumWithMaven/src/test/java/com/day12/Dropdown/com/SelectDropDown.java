package com.day12.Dropdown.com;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;



public class SelectDropDown {

	public Actions doActions;
	public SoftAssert objSoftAssert=new SoftAssert();
	public Select dropDown;
	private BaseTest objBaseTest;

	public SelectDropDown(BaseTest baseTest) {
		this.objBaseTest = baseTest;
	}

	public void selectRefrance(String strPath) {
		dropDown = new Select(objBaseTest.getDriver().findElement(By.xpath("//select[@id='" + strPath + "']")));
	}

	public void checkPegeHeaderIsDisplayed() {

		objSoftAssert.assertFalse(objBaseTest.getDriver()
				.findElement(By.xpath(
						"//h3[text()='This would be your first example on select dropd down list to with Selenium.']"))
				.isDisplayed());
		System.out.println("Header is Displayed");
		objSoftAssert.assertAll();
	}

	public void verifySelectListDemoText(String strSelectListPath, String strText) // verify Select Text Single and
																					// Multi
	{
		By locator = By.xpath("//div[text()='" + strSelectListPath + "']");

		objSoftAssert.assertEquals(objBaseTest.getDriver().findElement(locator).isDisplayed(), strText);

	}

	public void getDefalultSelectedItem() {
		this.selectRefrance("select-demo");
		String DefaultSelected = dropDown.getFirstSelectedOption().getText();

		System.out.println("Default Selected Item :" + DefaultSelected);
	}

	public boolean isDropdownSelected() {
		boolean blnFlag = false;
		blnFlag = objBaseTest.getDriver().findElement(By.xpath("//select[@id='select-demo']")).isSelected();

		return blnFlag;
	}

	public void selectValueFromDropDown(String strSelectDay) {

		objSoftAssert.assertFalse(isDropdownSelected());
		dropDown.selectByVisibleText(strSelectDay);
	}

	public void getselectedValue(String getValuePath) // getSelected value single and Multi
	{
		String strgetSelectedValue = objBaseTest.getDriver().findElement(By.xpath("//p[@class='" + getValuePath + "']"))
				.getText();
		System.out.println(strgetSelectedValue);
	}

	public void selectMultipleValuesDropDown(String strSelectOptionOne, String strSelectOptionTwo,
			String strSelectOptionThree) {
		objBaseTest.scrollPage(300);
		this.selectRefrance("multi-select");
		
		objSoftAssert.assertTrue(dropDown.isMultiple());
		dropDown.selectByVisibleText(strSelectOptionOne);
		dropDown.selectByVisibleText(strSelectOptionTwo);
		dropDown.selectByVisibleText(strSelectOptionThree);

	}

	public void clickOnGetAllSelectedButton() {
		objBaseTest.setImplicitlyWait(10);
		objBaseTest.getDriver().findElement(By.xpath("//button[@id='printAll']")).click();
	}

}
