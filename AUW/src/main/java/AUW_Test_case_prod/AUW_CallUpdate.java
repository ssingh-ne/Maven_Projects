package AUW_Test_case_prod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import AUW_Pages.AUW_callupdate;
import AUW_prod.Base_Class;

public class AUW_CallUpdate extends Base_Class {
	
	
	@Test
	public void main() throws InterruptedException{
		
		AUW_callupdate callupdate = new AUW_callupdate(driver);
		
		callupdate.Update_URL();
		callupdate.Header_();
		callupdate.Facts_View();
		callupdate.Header_();
		callupdate.Reload_Update_URL();
		callupdate.Facts_Download();
					
	}
}
