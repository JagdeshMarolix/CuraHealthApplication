package com.testcases;

import org.apache.http.util.Asserts;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.BaseTest;
import com.pageobjects.LoginFunctionality;
import com.utils.Utils;

public class LoginTestCases extends BaseTest {
	LoginFunctionality lf;
	public LoginTestCases() {
		super();
	}
	@BeforeMethod
	public void setup() {
		initialization();
		lf = new LoginFunctionality();
	}
	@Test(priority = 1)
	public void ValidLoginValidation() throws Throwable {
		lf.VerifyValidLogin();
		String url = driver.getCurrentUrl();
		Assert.assertEquals(url, "https://katalon-demo-cura.herokuapp.com/#appointment");
	}
	@Test(priority = 2)
	public void InvalidLoginValidation() throws Throwable {
		lf.VerifyInvalidLogin();
		String url = driver.getCurrentUrl();
		Assert.assertEquals(url, "https://katalon-demo-cura.herokuapp.com/#appointment");
	}
	@AfterMethod
	public void teardown(ITestResult result) throws Throwable {
		if(result.getStatus() == ITestResult.FAILURE) {
			String Method = result.getMethod().getMethodName() + "-"+ ".png";
			Utils.GetScreenShot(Method, driver);
			
		}
		
		
	}

}
