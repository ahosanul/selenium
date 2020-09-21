package model;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

public class Photo {
	{
		System.setProperty("webdriver.chrome.driver","/media/skb/movies/Ubuntu_Apps_location/AppsData/eclipseData/1_selenium/JarFiles/chromedriver");
	}
	 
	ChromeDriver driver=new ChromeDriver();
	
	public void takeScreenshot(String pathname) throws IOException  {
	    File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	    
		FileUtils.copyFile(src, new File(pathname));
	
		
		
		
	}



}
