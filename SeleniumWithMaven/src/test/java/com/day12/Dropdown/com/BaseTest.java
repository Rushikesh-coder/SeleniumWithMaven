package com.day12.Dropdown.com;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {

	public WebDriver driver = null;
	public Properties objConfig;
	
	public void initilizeWebEnvirnment() {
		this.loadConfigProperties();
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "/src/main/resources/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(objConfig.getProperty("AUT_URL_DropDown"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	public void loadConfigProperties() {
		try {
			objConfig = new Properties();
			objConfig.load(new FileInputStream(System.getProperty("user.dir") + "/src/test/resources/configuration/config.properties"));
			System.out.println("No Exception");
		} catch (Exception exception) {
			System.out.println(exception.getMessage());
			exception.printStackTrace();
		}
	}
	public void setImplicitlyWait(int intTimeInSecond)
	{
		driver.manage().timeouts().implicitlyWait(intTimeInSecond, TimeUnit.SECONDS);
	}
	
	public void scrollPage(int intScrollBy)
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;  
		js.executeScript("window.scrollBy(0,"+intScrollBy+")");
	}
	
	public WebDriver getDriver()
	{
		return driver;
	}
	public void tearDownEnvirnment()
	{
		driver.quit();
		System.out.println("Browser closed");
	}


}
