package com.day12.facebookPara.com;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class faceBookLoginPage {
	public WebDriver driver = null;
	
	
	public void initilizeWebEnvirnment() {
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "/src/main/resources/drivers/chromedriver.exe");
		driver = new ChromeDriver();
//		driver.get(objConfig.getProperty("AUT_URL_RedioButton"));
		 driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
	}
	
	public void loginUsingCredentials(String strUserName, String strPassword)
	{
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(strUserName);
		System.out.println("UserName is enterd : "+strUserName);
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(strPassword);
		System.out.println("Passwor is enterd : "+strPassword);
	}
}
