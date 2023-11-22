package com.utils;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;

public class Utils  {
	public static void GetScreenShot(String Method, WebDriver driver) throws Throwable, Throwable {
		File file1 = new File(Method);
		FileUtils.copyFile(((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE), file1);
		
		
	}

}
