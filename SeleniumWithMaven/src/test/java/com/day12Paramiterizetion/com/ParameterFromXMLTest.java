package com.day12Paramiterizetion.com;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;





public class ParameterFromXMLTest {
	
	@Parameters({"browser","env"})
	@Test(dataProvider = "getData", dataProviderClass = TestParamiterization.class)
	public void getUserLoginCredientials(String browser, String env)
	{
		TestParamiterization objTestParamiterization = new TestParamiterization();
		System.out.println(browser + "------" + env);
		objTestParamiterization.doLogInWithParameters(browser, env);
		
		System.out.println("get user login credentials method");
	}
	
	@Parameters({"browser","env"})
	@Test
	public void getBrowser(String browser,String env) {
		TestParamiterization objTestParamiterization=new TestParamiterization();
		System.out.println(browser + "------" + env);
		objTestParamiterization.doLogIn(browser, env);
		System.out.println("getBrowser method");
	}
}
