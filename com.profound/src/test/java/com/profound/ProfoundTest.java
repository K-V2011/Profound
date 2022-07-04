package com.profound;

import java.io.IOException;

import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.profound.pages.HomePage;

import util.ReadProperty;
import util.ScreenShotDemo;


@Listeners(ListenerDemo.class)
public class ProfoundTest  extends BaseDemo{
	
	HomePage homepage;
	
	
	
	
	
	@BeforeMethod
	public void Registation() throws IOException, InterruptedException {
		
		homepage=new HomePage(driver);
		homepage.clickOnCources(driver);
		
		homepage.setName(ReadProperty.read("Name"));
		homepage.setQualification(ReadProperty.read("Qualification"));
		homepage.setContact(ReadProperty.read("MobileNo"));
		homepage.setemail(ReadProperty.read("Email"));
		homepage.setCourse(ReadProperty.read("CCourse"));
		homepage.setCity(ReadProperty.read("City"));
		homepage.WriteMessage(ReadProperty.read("Message"));
		
		
		Thread.sleep(3000);
		homepage.setBranch(ReadProperty.read("Branch"));
		
	
		
		homepage.clickOnEnquiry();

		Thread.sleep(4000);
		
	}
	
	@Test(groups ="pune"  )
	public void Test1() throws IOException {
		
		String Actual=driver.getCurrentUrl();
	    String Expected="https://www.profoundedutech.com/thank-you";
	    
	    Assert.assertEquals(Actual, Expected);
	    
	  
	    
	    System.out.println("Test passed");
	    
	    
	    
		
	}
	

}
