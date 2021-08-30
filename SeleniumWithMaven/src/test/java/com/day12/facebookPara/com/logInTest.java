package com.day12.facebookPara.com;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class logInTest extends TestData {

	faceBookLoginPage objFaceBookLoginPage = new faceBookLoginPage();

	@Parameters({"browser","env"})
	@BeforeMethod
	public void initializeweb(String Browser, String enviernment) {
		objFaceBookLoginPage.initilizeWebEnvirnment(Browser, enviernment);
	}
	
	@AfterMethod
	public void close()
	{
		objFaceBookLoginPage.driver.close();
	}

	@Test(dataProvider = "getData", dataProviderClass = TestData.class)
	public void login(String username, String password) {
		objFaceBookLoginPage.loginUsingCredentials(username, password);
	}
}
