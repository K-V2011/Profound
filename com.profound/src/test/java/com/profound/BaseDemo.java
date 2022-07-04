package com.profound;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import util.ReadProperty;

public class BaseDemo {
	
	
	public WebDriver driver;
	
	
	
	@BeforeClass
	@Parameters("browser")
	public void  LaunchBrowser(String browser) throws IOException {
		
	
		if(browser.equals("chrome")) {
			
		
		System.setProperty("webdriver.chrome.driver", "./drivers\\chromedriver.exe");
		 
		driver=new ChromeDriver();
		
		}else if(browser.equals("edge")) {
			
			
			System.setProperty("webdriver.edge.driver", "./drivers\\msedgedriver.exe");
			 
			driver=new EdgeDriver();
			
			
		}
		
		driver.get(ReadProperty.read("url"));
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		
	}
	
	
	@AfterClass
	public void TearDown() {
		
		driver.close();
		
	}
	
	
	

}
