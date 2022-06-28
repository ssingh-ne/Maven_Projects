package Careers_Pages;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Side_Heading {
	
	
	WebDriver driver;
	
	public Side_Heading (WebDriver driver){
		this.driver=driver;
	}

	
	By Side_heading1 = By.xpath("(//*[@id='sticky-nav']/ul/li)[1]");
    By Side_heading2 = By.xpath("//*[@id='sticky-nav']/ul/li[2]/div/a");
	By Side_heading3 = By.xpath("//*[@id='sticky-nav']/ul/li[3]/div/a");
	By Side_heading4 = By.xpath("//*[@id='sticky-nav']/ul/li[4]/div/a");
	By Side_heading5 = By.xpath("//*[@id='sticky-nav']/ul/li[5]/div/a");
	By Side_heading4_link = By.xpath("//*[text()='Insurance Business America ']");
	
	
	public void Side_heading_1 () throws InterruptedException {
		
		Thread.sleep(5000);
		driver.findElement(Side_heading1).click();
		Thread.sleep(5000);
	}
	
   public void Side_heading_2 () throws InterruptedException {
		
		Thread.sleep(5000);
		driver.findElement(Side_heading2).click();
		Thread.sleep(5000);
	}
	
   public void Side_heading_3 () throws InterruptedException {
		
		Thread.sleep(5000);
		driver.findElement(Side_heading3).click();
		Thread.sleep(5000);
		
	}
	
   public void Side_heading_4 () throws InterruptedException {
		
		Thread.sleep(5000);
		driver.findElement(Side_heading4).click();
		Thread.sleep(5000);
		
	}
	
   public void Side_heading_URL () throws InterruptedException {
	   
	   driver.findElement(Side_heading4_link).click();
	     
   }
   
   public void Side_heading_5 () throws InterruptedException {
		
		Thread.sleep(5000);
		driver.findElement(Side_heading5).click();
		Thread.sleep(5000);
		
	}
	
	
}
