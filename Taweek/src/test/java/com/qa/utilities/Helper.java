package com.qa.utilities;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Helper {
	//we put all the methods in the function like capture screenshot,get current date time,handle frame,switch to, pop ups
	
	public String captureScreen(WebDriver driver) {
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest = new File("./Screenshots/Bank"+getCurrentTime()+".png");
		//converting a relative path to absolute path u need absolute path to get screenshot embedded in html
		String fullPath =dest.getAbsolutePath();
		try {
			FileHandler.copy(src, dest);
			System.out.println("Screenshot captured");
		} catch (Exception e) {
			System.out.println("Screenshot not captured");
			
		}
		return fullPath;
	

}
	public String getCurrentTime() {
		DateFormat myFormat =new SimpleDateFormat("MM_dd_yyyy_HH_mm");
		Date currentDate = new Date();
		return myFormat.format(currentDate);
		
}
	}
