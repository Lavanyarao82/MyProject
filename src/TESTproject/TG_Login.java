package TESTproject;


import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import TestNG.Basemethods;
public class TG_Login {
	Basemethods base;
	  @BeforeMethod
	  public void openapp()
	  {
	    base=new Basemethods();
	    base.openbrowser();
	    base.launchERP();
	    
	  }  
  @Test
  public void login()
  {
      base.LoginERP();
    //  String pname = null;
	//Assert.assertEquals(name, "Dashboard");
  }
@Test
  public  void TG_logout()
  {
	  base.LoginERP();
	  
	  base.driver.findElement(By.xpath("//li[@id='mi_logout']")).click();
	  WebElement login=base.driver.findElement(By.xpath("//button[@id='btnsubmit']"));
	  
	  String log=login.getText();
	 System.out.println(log);
	 Assert.assertTrue(login.isEnabled());
	 base.driver.close();
  }
@Test
public void TG_Reset()
{
	base.driver.findElement(By.xpath("//button[@id='btnreset']")).click();
	String uname=base.driver.findElement(By.id("username")).getText();
	
	String pass=base.driver.findElement(By.id("password")).getText();
	
	Assert.assertTrue(uname.isEmpty() && pass.isEmpty());
	base.driver.close();
	
}

@Test
public void TG_Invalidlogin()
{
	base.loginERP1("admin", "master123");
	
	base.driver.close();

}
}
