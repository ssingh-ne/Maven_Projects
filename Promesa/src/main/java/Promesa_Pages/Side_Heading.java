package Promesa_Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Side_Heading {
	
WebDriver driver;
	
	public Side_Heading (WebDriver driver){
		this.driver=driver;
	}
	
	
	By side_heading1 = By.xpath("(//*[@id='sticky-nav']/ul/li)[1]");
	By side_heading2 = By.xpath("(//*[@id='sticky-nav']/ul/li)[2]");
	By side_heading3 = By.xpath("(//*[@id='sticky-nav']/ul/li)[3]");
	By side_heading4 = By.xpath("(//*[@id='sticky-nav']/ul/li)[4]");
	By side_heading5 = By.xpath("(//*[@id='sticky-nav']/ul/li)[5]");
	By side_heading6 = By.xpath("(//*[@id='sticky-nav']/ul/li)[6]");
	
	By side_heading1_title = By.xpath("//*[@class='section__content']/div/div/h2");
	By side_heading2_title = By.xpath("(//*[@class='section__content']/div/div/h3)[2]");
	By side_heading3_title = By.xpath("(//*[@class='section__content']/div/div/h3)[3]");
	By side_heading4_title = By.xpath("(//*[@class='section__content']/div/div/h3)[4]");
	By side_heading5_title = By.xpath("(//*[@class='section__content']/div/div/h3)[5]");
	By side_heading6_title = By.xpath("//*[@class='section__content']/div/h3");
	
	
	
	public void Side_heading1 () {
		
		String SideHeading = driver.findElement(side_heading1).getText();
		System.out.println("Side Heading = " + SideHeading);
		
		
	}
	
	
	
	
	
	
	
	
	
}
