package AUW_prod;

import org.testng.annotations.Test;

import AUW_Pages.NJ_Update;

public class AUW_NJ_Update extends Base_Class {
	
	
	@Test
	public void main() throws InterruptedException{
		
		NJ_Update nj = new NJ_Update(driver);
		
		
		nj.Update_URL();
		nj.Header_();
		nj.Facts_View();
		nj.Header_();
		nj.Reload_Update_URL();
		nj.Facts_Download();
					
	}

}