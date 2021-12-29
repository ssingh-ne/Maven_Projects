package Tradewel_Test_Cases_Development;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import Tradewel_Pages.Amplience;
import Tradewel_Pages.Home_Page;

public class comprehensive_Protection extends Base_class{
	
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
	
	a.Amplience_url();
	
	
	a.Amplience_Login();
	a.Tradewel_content();
	
	a.Tradewel_Tab_one();
	
	int size = driver.findElements(By.tagName("iframe")).size();
 	System.out.println(size);
 	driver.switchTo().frame(0);
 	
 	
 	Thread.sleep(5000);
 	String s1 = driver.findElement(By.xpath("//*[@id='root']/div/div/div/div/div/div[2]/div[2]/div/p")).getText();
 	
 	System.out.println("Amp Tab 1 text = " + s1);

	driver.switchTo().defaultContent();
	
    a.Tradewel_Tab_Two();
	
	int size2 = driver.findElements(By.tagName("iframe")).size();
 	System.out.println(size);
 	driver.switchTo().frame(0);
 	
 	
 	Thread.sleep(5000);
 	String s2 = driver.findElement(By.xpath("//*[@id='root']/div/div/div/div/div/div[2]/div[2]/div/p")).getText();
 	
 	System.out.println("Amp Tab 2 text = " + s2);
 	driver.switchTo().defaultContent();
	
   a.Tradewel_Tab_Three();
	
	int size3 = driver.findElements(By.tagName("iframe")).size();
 	System.out.println(size);
 	driver.switchTo().frame(0);
 	
 	
 	Thread.sleep(5000);
 	String s3 = driver.findElement(By.xpath("//*[@id='root']/div/div/div/div/div/div[2]/div[2]/div/p")).getText();
 	
 	System.out.println("Amp Tab 3 text = " + s3);
 	driver.switchTo().defaultContent();
	
    a.Tradewel_Tab_Four();
	
	int size4 = driver.findElements(By.tagName("iframe")).size();
 	System.out.println(size);
 	driver.switchTo().frame(0);
 	
 	
 	Thread.sleep(5000);
 	String s4 = driver.findElement(By.xpath("//*[@id='root']/div/div/div/div/div/div[2]/div[2]/div/p")).getText();
 	
 	System.out.println("Amp Tab 4 text = " + s4);
 	driver.switchTo().defaultContent();
	
    a.Tradewel_Tab_Five();
	
	int size5 = driver.findElements(By.tagName("iframe")).size();
 	System.out.println(size);
 	driver.switchTo().frame(0);
 	
 	
 	Thread.sleep(5000);
 	String s5 = driver.findElement(By.xpath("//*[@id='root']/div/div/div/div/div/div[2]/div[2]/div/p")).getText();
 	
 	System.out.println("Amp Tab 5 text = " + s5);
	
	
	
	Assert.assertEquals(Tab1, s1);
	Assert.assertEquals(Tab2, s2);
	Assert.assertEquals(Tab3, s3);
	Assert.assertEquals(Tab4, s4);
	Assert.assertEquals(Tab5, s5);
	}
}


