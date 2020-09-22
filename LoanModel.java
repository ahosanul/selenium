package model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LoanModel {
	
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Nowrin\\eclipse-workspace\\IEBN\\src\\main\\resources\\chromedriver.exe");
	}
	ChromeDriver driver=new ChromeDriver();
	
	
	
	
	//By path or name or id ..
	
	private By loan=By.name(null);
	private By newloan= By.className(null);
	
	//states 
	private By states=By.name(null);
	//city 
	private By city=By.name(null);
	//branch 
	private By branch =By.name(null);
	// loan type
	private By loantype =By.name(null);
	
	//end 
	
	
	//goto new loan request
	public void gonewloan() {
		driver.findElement(loan).click();
		driver.findElement(newloan).click();
	}
	
	//select states by name 
	public void states(String name)
	{
		WebElement statesname = driver.findElement(states);
		Select select =new Select(statesname);
		select.selectByVisibleText(name);
	}
	
	//select city by name
	public void city(String name ) {
		WebElement statesname = driver.findElement(city);
		Select select =new Select(statesname);
		select.selectByVisibleText(name);
		
	}
	
	//select branch by name
	public void branch(String name ) {
		WebElement statesname = driver.findElement(branch);
		Select select =new Select(statesname);
		select.selectByVisibleText(name);
		
	}
	
	//select loan type by name 
	public void loantype(String name ) {
		WebElement statesname = driver.findElement(loantype);
		Select select =new Select(statesname);
		select.selectByVisibleText(name);
		
	}
	

}
