package TESTproject;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import TestNG.Basemethods;

public class TG_Stockitems 
{
	Basemethods base;
	@BeforeMethod
	public void testapp()
	{
		base=new Basemethods();
		base.openbrowser();
		base.launchERP();
		base.LoginERP();
		
	}
	
        @Test
        public void TG_Customer()
        {
	       
        	base.Logout();
        	
       }
}
