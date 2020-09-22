package model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BlockUnblockCardModel {
	
	
		
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Nowrin\\eclipse-workspace\\IEBN\\src\\main\\resources\\chromedriver.exe");
		}
		ChromeDriver driver=new ChromeDriver();
		
		
		//Radio button of Request type
		By block=By.name(null);
		By unblock=By.name(null);
		
		By cardType=By.name(null);
		By cardNo=By.className(null);
		
		public void block() {
			driver.findElement(block).click();
		}
		
		public void unblock() {
			driver.findElement(unblock).click();
		}
		
		public void cardtype(String cardT) {
			WebElement card = driver.findElement(cardType);
			
			Select select =new Select(card);
			select.selectByVisibleText(cardT);
		}
		
		public void cardinfo(String cardin) {
			WebElement card = driver.findElement(cardNo);
			Select select =new Select(card);
			select.selectByVisibleText(cardin);
		}


}
