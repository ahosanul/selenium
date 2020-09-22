package model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

	public class PayeeModel {
	
		WebDriver driver=null;
		
		void PayeeModel(WebDriver driver)
		{
			this.driver=driver;
		}
		
	
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
