package Tradewel_Test_Cases_Production;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Tradewel_Pages.Amplience;
import Tradewel_Pages.Home_Page;

public class Comprehensive_Protection_FF extends Base_class{
	
	@Test
	public void Comprehensive() throws InterruptedException{
		
		
		By Cop_tab1  = By.xpath("(//*[@id='contentBlock0']/p)[6]");
		By Cop_tab2  = By.xpath("(//*[@id='contentBlock0']/p)[7]");
		By Cop_tab3  = By.xpath("(//*[@id='contentBlock0']/p)[8]");
		By Cop_tab4  = By.xpath("(//*[@id='contentBlock0']/p)[9]");
		By Cop_tab5  = By.xpath("(//*[@id='contentBlock0']/p)[10]");
		
	
	Home_Page h = new Home_Page(driver);
	Amplience a = new Amplience(driver);
	
	
	h.Comprehensive_tab2();
	Thread.sleep(2000);
	String Tab2 = driver.findElement(Cop_tab2).getText();
	System.out.println("Tab 2 = " + Tab2);
	Thread.sleep(2000);
    
	h.Comprehensive_tab3();
	Thread.sleep(2000);
	String Tab3 = driver.findElement(Cop_tab3).getText();
	System.out.println("Tab 3  = " + Tab3);
	Thread.sleep(2000);
	
    h.Comprehensive_tab4();
    Thread.sleep(2000);
	String Tab4 = driver.findElement(Cop_tab4).getText();
	System.out.println("Tab 4  = " + Tab4);
	Thread.sleep(2000);
	
    h.Comprehensive_tab5();
    Thread.sleep(2000);
	String Tab5 = driver.findElement(Cop_tab5).getText();
	System.out.println("Tab 5  = " + Tab5);
	Thread.sleep(2000);
	
    h.Comprehensive_tab1();
    Thread.sleep(2000);
	String Tab1 = driver.findElement(Cop_tab1).getText();
	System.out.println("Tab 1  = " + Tab1);
	Thread.sleep(2000);
	

}}
