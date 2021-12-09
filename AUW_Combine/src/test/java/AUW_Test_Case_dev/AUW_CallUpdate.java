package AUW_Test_Case_dev;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import AUW_Pages.AUW_callupdate;
import AUW_Pages.Home_page;

public class AUW_CallUpdate extends Base_class {
	
	
	@Test
	public void main() throws InterruptedException{
		
		AUW_callupdate callupdate = new AUW_callupdate(driver);
		Home_page h = new Home_page(driver);
		
		callupdate.Update_URL();
		h.Cookies();
		callupdate.Header_();
		callupdate.Facts_View();
		callupdate.Header_();
		callupdate.Reload_Update_URL();
		callupdate.Facts_Download();
					
	}
}
