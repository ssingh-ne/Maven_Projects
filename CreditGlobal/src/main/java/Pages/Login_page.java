package Pages;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login_page {
	
	WebDriver driver;
	
    public Login_page (WebDriver driver){
		
		this.driver=driver;
	}

    By Login =  By.xpath("//*[text()='Login']");
    
    By forgot_pass = By.xpath("//*[text()='Forgot Password']");
    
    String Forgot_password_url_exp = "https://develop--credit-global.netlify.app/resetpassword";
    String Prod_Forgot_password_url_exp = "https://cg.com/resetpassword";
    
    
   public void forgot_password () throws InterruptedException {
	   
	   WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(Login));
		
		driver.findElement(Login).click();
		
		Thread.sleep(5000);
		
        driver.findElement(forgot_pass).click();
        
        String currentUrl = driver.getCurrentUrl();
        
        System.out.println("currentUrl = " + currentUrl);  
        
        assertEquals(currentUrl, Forgot_password_url_exp);
       
   }
    
  public void forgot_password_prod () throws InterruptedException {
	   
	   WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(Login));
		
		driver.findElement(Login).click();
		
		Thread.sleep(5000);
		
        driver.findElement(forgot_pass).click();
        
        String currentUrl = driver.getCurrentUrl();
        
        System.out.println("currentUrl = " + currentUrl);  
        
        assertEquals(currentUrl, Prod_Forgot_password_url_exp);
       
   }

}
