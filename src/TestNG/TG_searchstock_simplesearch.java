package TestNG;
import org.openqa.selenium.By;

import TestNG.Basemethods; 

public class TG_searchstock_simplesearch
{
	static Basemethods base;

	public static void main(String[] args) 
	{
		base =new Basemethods();
		base.openbrowser();
		base.launchERP();
		base.LoginERP();
		base.driver.findElement(By.xpath("//li[@id='mi_a_stock_items']")).click();
		base.driver.findElement(By.xpath("//span[@data-caption='Search']")).click();
		
		base.driver.findElement(By.id("psearch")).sendKeys("soni");
		base.driver.findElement(By.id("btnsubmit")).click();
		
	}

}

