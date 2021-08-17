package com.day12Paramiterizetion.com;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestParamiterization {

	
	@Test(dataProvider = "getData")
	public void doLogIn(String username, String password) {
		System.out.println("Test Data ============> "+username+ "--------password===========>"+password);
	System.out.println("dologin method");
	}
	
	@DataProvider
	public Object[][] getData()
	{
	Object[][] data=new Object[3][2];
	
		data[0][0]="rushikesh@gmail.com";
		data[0][1]="ABC@123";
		
		data[1][0]="Pramod@gmail.com";
		data[1][1]="xyz@123";
		
		data[2][0]="Akash@gmail.com";
		data[2][1]="akash@123";
		
		return data;
		
	}
	

	public void doLogInWithParameters(String username, String password)
	{
		System.out.println("Test Data ============> "+username+ "--------password===========>"+password);
		System.out.println("dologinwith pararmiters method");
	}
}
