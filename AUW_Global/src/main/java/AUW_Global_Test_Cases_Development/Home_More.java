package AUW_Global_Test_Cases_Development;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import AUW_Global_Pages.Amplience;
import AUW_Global_Pages.Home_page;
import AUW_Global_Pages.LearnMore_page;

public class Home_More extends Base_class {
	
	
	@Test
	public void More_button() throws InterruptedException {
		
		System.out.println("Verify contents on Learn more page");  
		
		By more_btn_content = By.xpath("((//*[@class='letter_expanded']/div)[1]/p)[1]");
		
		Home_page h = new Home_page(driver);
		Amplience a = new Amplience(driver);
		
		
		h.More_messageFounder();
		//h.more_content();
		
		   String More_content = driver.findElement(more_btn_content).getText();
		   
		   System.out.println("Content on click of more button = " + More_content);
		
		a.Amplience_url();
		a.Amplience_Login();
		a.Global_slot();
		
		a.Global_slotEdit_one();
		
		int size = driver.findElements(By.tagName("iframe")).size();
	 	System.out.println(size);
	 	driver.switchTo().frame(1);
	 	
	 	Thread.sleep(5000);
	 	 JavascriptExecutor js = (JavascriptExecutor) driver;
	 	 WebElement Element = driver.findElement(By.xpath("//*[@id='tinymce']/p"));
	 	 js.executeScript("arguments[0].scrollIntoView();", Element);
	 	Thread.sleep(5000);
	 	String More_content_amp = driver.findElement(By.xpath("//*[@id='tinymce']/p")).getText();
	 	System.out.println("More Content = "+ More_content_amp);
	 	
	 	  assertTrue(More_content_amp.contains(More_content));
	 	 //Assert.assertTrue(EXP_link_Url.contains(LINKURL),"Failure message") ;
		
	}
	
	

}
