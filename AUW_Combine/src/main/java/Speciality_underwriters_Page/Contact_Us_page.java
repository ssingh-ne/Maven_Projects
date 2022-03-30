package Speciality_underwriters_Page;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Contact_Us_page {

	
	WebDriver driver;
	
	public Contact_Us_page (WebDriver driver){
		this.driver=driver;
	}

	
	By Contact_US = By.xpath("//span[@class='MuiButton-label']");
	By Contact_US_heading = By.xpath("//*[@id='eb440db3-fd5f-4482-b468-ab73211b6ffd4']/div/div/div/div/div/div/div/h2");
	By ContactUs_heading_URL_page = By.xpath("//*[@id='app']/div/div[2]/div/div/div[1]");
	
	
	
	String Contact_US_URL = "https://develop--specialty.netlify.app/contact-us";
	String Contact_US_URL_prod = "https://www.specialty.auw.com/contact-us";
	
	
	
	
	public void contactUs () throws InterruptedException {
		
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 //js.executeScript("window.scrollBy(0,1000)");
		 WebElement Element = driver.findElement(Contact_US);
		 js.executeScript("arguments[0].scrollIntoView();", Element);
		 
		Thread.sleep(5000); 
		 String s = driver.findElement(Contact_US_heading).getText();
		
		System.out.println("Contact_US_heading =" + s);
		String btn_Text = driver.findElement(Contact_US).getText();
		String Button_Text = btn_Text.toUpperCase();
		
		System.out.println("Contact us Button_Text = " + Button_Text);
		
		Thread.sleep(5000);
		
		driver.findElement(Contact_US).click();

		Thread.sleep(5000);
		String contact_us_heading = driver.findElement(ContactUs_heading_URL_page).getText();
		System.out.println("contact_us_heading = " + contact_us_heading);
		
		String URL = driver.getCurrentUrl();
		
		System.out.println("Current URL = " + URL);
		
		assertEquals(URL, Contact_US_URL);
		assertEquals(Button_Text, contact_us_heading);
		
	}
	
	public void contactUs_Prod () throws InterruptedException {
		
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 //js.executeScript("window.scrollBy(0,1000)");
		 WebElement Element = driver.findElement(Contact_US);
		 js.executeScript("arguments[0].scrollIntoView();", Element);
		 
		Thread.sleep(5000); 
		 String s = driver.findElement(Contact_US_heading).getText();
		
		System.out.println("Contact_US_heading =" + s);
		String btn_Text = driver.findElement(Contact_US).getText();
		String Button_Text = btn_Text.toUpperCase();
		
		System.out.println("Contact us Button_Text = " + Button_Text);
		
		Thread.sleep(5000);
		
		driver.findElement(Contact_US).click();

		Thread.sleep(5000);
		String contact_us_heading = driver.findElement(ContactUs_heading_URL_page).getText();
		System.out.println("contact_us_heading = " + contact_us_heading);
		
		String URL = driver.getCurrentUrl();
		
		System.out.println("Current URL = " + URL);
		
		assertEquals(URL, Contact_US_URL_prod);
		assertEquals(Button_Text, contact_us_heading);
		
	}
	
	
	
}
