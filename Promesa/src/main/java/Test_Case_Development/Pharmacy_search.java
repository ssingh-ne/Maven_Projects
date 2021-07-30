package Test_Case_Development;

import javax.xml.ws.Holder;

import org.testng.annotations.Test;

import Pages.Home;
import Pages.Pharmacy_Search;

public class Pharmacy_search extends Base_class {
	
     @Test
	
	    public void Side_Heading_One () throws InterruptedException{

    	 Home h = new Home(driver);
	      Pharmacy_Search p = new Pharmacy_Search(driver);
	      
	      
	      h.Pharmacy_link();
	      p.Search_City("Phoenix");
	      p.Search_State("New York");
	      p.Search_Zip("10007");
	      p.Search_Address("Livy’s, 200 Water St, New York, NY 10038, United States");
	
	
   }


    }
