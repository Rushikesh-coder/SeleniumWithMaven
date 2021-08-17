package com.day12.facebookPara.com;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class logInTest extends TestData {

	faceBookLoginPage objFaceBookLoginPage = new faceBookLoginPage();

	@BeforeMethod
	public void initializeweb() {
		objFaceBookLoginPage.initilizeWebEnvirnment();
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
