package com.day12.facebookPara.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class TestData {
	
	
	
	@DataProvider
	public Object[][] getData()
	{
		Object[][] data=new Object[2][2];
		
		data[0][0]="rushikesh@gmail.com";
		data[0][1]="ABC@123";
		
		data[1][0]="Pramod@gmail.com";
		data[1][1]="xyz@123";
		
		return data;
		
	}
	
	
}
