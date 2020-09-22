package model;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Screenshot {
WebDriver driver=null;
	
	void Screenshot(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void screenshort(String name ) throws IOException
	{
		File file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File("C:\\Users\\Nowrin\\eclipse-workspace\\IEBN\\Screenshot\\"+name+".jpg"));
		
	}
	
	

}
