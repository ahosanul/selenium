package model;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class MasterPageModel {
	
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Nowrin\\eclipse-workspace\\IEBN\\src\\main\\resources\\chromedriver.exe");
	}
	ChromeDriver driver=new ChromeDriver();
	
	
	
	public void click(By path)
	{
		driver.findElement(path).click();
	}
	
	
	
	

}
