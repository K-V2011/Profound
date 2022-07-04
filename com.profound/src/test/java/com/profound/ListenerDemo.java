package com.profound;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import util.ScreenShotDemo;

public class ListenerDemo implements ITestListener {
      
	
	public void onStart(ITestContext context) {
		
		
		System.out.println("Test Started");
		
	}
	
	public void onTestFailure(ITestResult result) {
		
		
		System.out.println("Test Failed");
	}
	
	public void onFinish(ITestContext context) {
		
		System.out.println("Test Finish");
	}
}
