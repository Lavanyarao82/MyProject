package TestNG;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import TestNG.Basemethods; 

public class TC_Reset {
      static Basemethods base;
	public static void  main(String[] args)
	{
		base=new Basemethods();
		base.openbrowser();
		base.launchERP();
		WebElement reset=base.driver.findElement(By.id("btnreset"));
		reset.click();
		
		WebElement uname=base.driver.findElement(By.id("username"));
		String name=uname.getAttribute("value");
		
		WebElement password=base.driver.findElement(By.id("password"));
		String pass=password.getAttribute("value");
		
		
		System.out.println("username:" +name);
		System.out.println("password:" +pass);
		
		if(name.isEmpty() && pass.isEmpty())
		{
		  System.out.println("Reset is working....,testcase is passed ");
		}
		else
		{
			System.out.println("Testcase is failed");
		}
		

	}

}
