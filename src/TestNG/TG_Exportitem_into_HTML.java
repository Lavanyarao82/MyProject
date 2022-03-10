package TestNG;
import org.openqa.selenium.By;

import TestNG.Basemethods;

public class TG_Exportitem_into_HTML 
{
    static Basemethods base;
	public static void main(String[] args) 
	{
		base=new Basemethods();
		base.openbrowser();
		base.launchERP();
		base.LoginERP();
		
		base.driver.findElement(By.xpath("//li[@id='mi_a_stock_items']")).click();
		base.driver.findElement(By.xpath("//button[@data-original-title='Export']")).click();
		
		base.driver.findElement(By.xpath("//a[@data-caption='HTML']")).click();
		String title=base.driver.getCurrentUrl();
		System.out.println(title);
		if(title.contains("html"))
		{
			System.out.println("html page s successsful.....testcase is success ");
		}
		else 
		{
			System.out.println("testcase s failed");
		}
		
	}

}
