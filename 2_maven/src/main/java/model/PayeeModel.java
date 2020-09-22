package model;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

	public class PayeeModel {
	
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Nowrin\\eclipse-workspace\\IEBN\\src\\main\\resources\\chromedriver.exe");
		}
		ChromeDriver driver=new ChromeDriver();
		
	
	    //path by name id or class name 
	private By payeeaccountNumber =By.name(null);
	private By payeeName =By.name(null);
	private By payeenickName =By.name(null);
	private By repayeeaccountNumber=By.className(null);
	private By addPayeeButton=By.name(null);
	private By resetButton=By.className(null);
		//end of 
		
	
	    //add payee 
		public void addPayee(String accountnum,String name,String nickname) {
			driver.findElement(payeeaccountNumber).sendKeys(accountnum);
			driver.findElement(repayeeaccountNumber).sendKeys(accountnum);
			driver.findElement(payeeName).sendKeys(name);
			driver.findElement(payeenickName).sendKeys(nickname);
			driver.findElement(addPayeeButton).click();
		}
		
		//reset button click
		public void clickReset() {
			driver.findElement(resetButton).click();
		}

}
