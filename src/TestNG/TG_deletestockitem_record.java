package TestNG;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;

import TestNG.Basemethods; 

public class TG_deletestockitem_record 
{
	static Basemethods base;
	public static void main(String[] args)
	{
		base =new Basemethods();
		base.openbrowser();
		base.launchERP();
		base.LoginERP();
		base.driver.findElement(By.xpath("//li[@id='mi_a_stock_items']")).click();
		
		base.driver.findElement(By.xpath("//span[@data-caption='Actions']")).click();
		 String val=base.driver.findElement(By.xpath("//input[@value='532']")).getAttribute("value");
		 System.out.println(val);
		 WebElement text  =base.driver.findElement(By.xpath("//input[@value='533']"));
		   text.click();
	
		base.driver.findElement(By.xpath("//a[@data-caption='Delete Selected Records']")).click();
		
		
		String errmsg=base.driver.getWindowHandle();
		base.driver.switchTo().window(errmsg);
		base.driver.findElement(By.xpath("//button[@class='ajs-button btn btn-primary']")).click();
	
		
	//	String errmsg1=base.driver.getWindowHandle();
		//base.driver.switchTo().window(errmsg1);
		base.driver.findElement(By.xpath("//button[@class='ajs-button btn btn-primary']")).click();
		  if(base.driver.findElement(By.xpath("//input[@value='533']")).isEnabled())
		  {
			  System.out.println("textcase is not passed");
		  }
		  else
		  {
			  System.out.println("stock item is deleted.....textcase is  passed");
		  }
	//	if(val.equals("534"))
		//{
			//System.out.println("stock item is deleted.....textcase is  passed");
			
		//}
	///	else 
		//{
			//System.out.println("textcase is not passed");
		//}
	}

}
