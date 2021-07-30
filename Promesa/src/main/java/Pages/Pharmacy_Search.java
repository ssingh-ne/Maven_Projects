package Pages;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class Pharmacy_Search {

	
	
WebDriver driver;
	
	public Pharmacy_Search (WebDriver driver){
		this.driver=driver;
	}
	
	
	String url = "https://promesa.auw.com/pharmacy-search";
	
	By search_field = By.xpath("//*[@autocomplete='new-password']");
	By name_city = By.xpath("//*[@id='listItem_0']/div/p[3]");
	By address = By.xpath("//*[@id='listItem_0']/div/p[2]");
	
	
	
	public void Search_City (String City) throws InterruptedException {
		
		Thread.sleep(5000);

		driver.findElement(search_field).clear();
		driver.findElement(search_field).click();
		driver.findElement(search_field).sendKeys(City);
		driver.findElement(search_field).sendKeys(Keys.ENTER);
		
		Thread.sleep(18000);
		
		String city_display = driver.findElement(name_city).getText();
		System.out.println("City = " + city_display);
		
	//	assertEquals(city_display, City);
		
		assertTrue(city_display.contains(City));
	      }
	
    public void Search_State (String State) throws InterruptedException {
		
		Thread.sleep(5000);
		driver.findElement(search_field).clear();
		driver.findElement(search_field).click();
		driver.findElement(search_field).sendKeys(State);
		driver.findElement(search_field).sendKeys(Keys.ENTER);
		
        Thread.sleep(18000);
		
		String State_display = driver.findElement(name_city).getText();
		System.out.println("State = " + State_display);
		
	//	assertEquals(city_display, City);
		
		assertTrue(State_display.contains(State));
		
	      }

   public void Search_Zip (String Zip) throws InterruptedException {
	
	Thread.sleep(5000);
	driver.findElement(search_field).clear();
	driver.findElement(search_field).click();
	driver.findElement(search_field).sendKeys(Zip);
	driver.findElement(search_field).sendKeys(Keys.ENTER);
	
	Thread.sleep(18000);
	
	String Zip_display = driver.findElement(name_city).getText();
	System.out.println("Zip = " + Zip_display);
	
//	assertEquals(city_display, City);
	
	assertTrue(Zip_display.contains(Zip));
	
	
        }
   
   public void Search_Address (String Address) throws InterruptedException {
		
		Thread.sleep(5000);
		driver.findElement(search_field).clear();
		driver.findElement(search_field).click();
		driver.findElement(search_field).sendKeys(Address);
		driver.findElement(search_field).sendKeys(Keys.ENTER);
		
		Thread.sleep(18000);
		
		String Address_display = driver.findElement(address).getText();
		System.out.println("Address = " + Address_display);
		
//		assertEquals(city_display, City);
		
		//assertTrue(Address_display.contains(Address));
		assertTrue(Address.contains(Address_display));
		
	        }
	   
   
	
}
