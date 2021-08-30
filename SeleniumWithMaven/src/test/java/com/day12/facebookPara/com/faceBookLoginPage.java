package com.day12.facebookPara.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class faceBookLoginPage {
	public WebDriver driver = null;
	
	public void initilizeWebEnvirnment(String Browser, String enviernment) {
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "/src/main/resources/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		 driver.get("https://www.facebook.com/");
//		driver.get(url);
		driver.manage().window().maximize();
		System.out.println("Browser : "+Browser+"   Enviernment : "+enviernment);
	}
	
	public void loginUsingCredentials(String strUserName, String strPassword)
	{
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(strUserName);
		System.out.println("UserName is enterd : "+strUserName);
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(strPassword);
		System.out.println("Passwor is enterd : "+strPassword);
	}
}
