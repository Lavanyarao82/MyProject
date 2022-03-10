package TestNG;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import TestNG.Basemethods;
public class TC_logout {
   static Basemethods base;
	public static void main(String[] args)
	{
		base =new Basemethods();
		base.openbrowser();
		base.launchERP();
		base.LoginERP();
		base.driver.findElement(By.xpath("//li[@id='mi_logout']")).click();
		
       WebElement login=base.driver.findElement(By.xpath("//button[@id='btnsubmit']"));
       
       if(login.isEnabled())
       {
    	   System.out.println("logout is successful.....tescase is passed");
       }
       else
       {
    	   System.out.println("testcase is failed");
       }
	}

}
