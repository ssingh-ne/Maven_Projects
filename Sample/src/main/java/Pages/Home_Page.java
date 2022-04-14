package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class Home_Page {


	WebDriver driver;
	
	
	
	By Profile = By.xpath("//*[text()='Profile']");
	By login = By.xpath("//*[@class='desktop-linkButton']");
	
	By search = By.xpath("//*[@class='desktop-searchBar']");
	By searched = By.xpath("//*[@class='title-title']");
	
	By loginpage = By.xpath("//*[@class='welcome-header']");
	
	String welcome_exp = "Login or Signup";

	public Home_Page (WebDriver driver){
		this.driver=driver;
	}


    public void Login () throws InterruptedException {
    	
    	
    	driver.findElement(Profile).click();

    	 Thread.sleep(3000);
    	 
    	 driver.findElement(login).click();
    	  
    	 Thread.sleep(3000);
    	 
    	 String welcome = driver.findElement(loginpage).getText();
    	
    	System.out.println("Login page welcome text = " + welcome);
    	
    	Assert.assertEquals(welcome, welcome_exp);
    }


   public void Search(String data) throws InterruptedException {
	   
	   driver.findElement(search).sendKeys(data);
	   driver.findElement(search).sendKeys(Keys.ENTER);
	   
	   Thread.sleep(3000);
	   
	  String s = driver.findElement(searched).getText();
	   
	  System.out.println("Searched Keyword = "+s);
	  
	  
	  Assert.assertEquals(data, s);
	   
	   
   }


}
