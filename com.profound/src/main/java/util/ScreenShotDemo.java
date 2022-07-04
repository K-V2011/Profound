package util;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShotDemo {
	
	


	public static void takeshot(WebDriver driver) throws IOException {
		// TODO Auto-generated method stub
		
		Date date=new Date();
		
		date.toString().replace("/", "").replace(":","");
		TakesScreenshot  ts=(TakesScreenshot) driver;
		
		File Source =ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("./snaps\\profound "+date+".jpeg");
		
		FileHandler.copy(Source, dest);
	}

}
