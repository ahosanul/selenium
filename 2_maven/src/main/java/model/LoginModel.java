package model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginModel {
	
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Nowrin\\eclipse-workspace\\IEBN\\src\\main\\resources\\chromedriver.exe");
	}
	ChromeDriver driver=new ChromeDriver();
	
	
	
	/*
	 * update this by using xpath or name or id 
	 */
	
	
	
	//on click sign up link 
	private By bysignup=By.name(null);
	
	//on click forgot account or unblock account
	private By byforgot=By.name(null);
	
	//on click login button
	  private  By byuser=By.name(" username input area ");
	  private By bypass=By.name(" password input area ");
	  private By bybutton=By.name("login button area ");
	  
	  //log out button 
	  private By bylogout=By.name(null);
	  
	  
	  
	
	
	 // end of update area
	
	  //website link
	  public void go(String url) {
		  driver.get(url);
	  }
	  
	  
	  //model area 
    public void loginm(String username,String password) {
    	
    	driver.findElement(byuser).sendKeys(username);
    	driver.findElement(bypass).sendKeys(password);
    	driver.findElement(bybutton).click();
    	System.out.println("Login Successfully");
    	
    }
    
    //on click sign up link
    public void signup() {
    	
    	driver.findElement(bysignup).click();
    }
    
    //on click forgot or unblock account
    public void forgotaccount() {
    	driver.findElement(byforgot).click();
    	
    }
    
    // masked or not masked check for password fild
    public void maskedcheck() {
    	WebElement password = driver.findElement(bypass);
    	if (password.getAttribute("type") == "password"){
    	    System.out.println("Masked");
    	}else {
    	    System.out.println("Not Masked");
    	}
    }
    
    //logout for login users
    
    public void logout() {
    	driver.findElement(bylogout).click();
    }

	
}
	
