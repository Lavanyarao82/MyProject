package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

public class ERP_copy {
     static Basemethods base;

	public static void main(String[] args) 
	
	{
		base=new Basemethods();
		base.openbrowser();
		base.launchERP();
		base.LoginERP();
		base.driver.findElement(By.xpath("//li[@id='mi_a_stock_items']")).click();
		
		base.driver.findElement(By.xpath("//span[@data-caption='View']")).click();
		
		
		base.driver.findElement(By.xpath("//span[@data-caption='Actions']")).click();
	//	base.driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
       
		base.driver.findElement(By.xpath("//a[@data-caption='Copy']")).click();
		base.driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	
		base.driver.findElement(By.xpath("//button[@id='btnAction']")).click();
		String webid=base.driver.getWindowHandle();
		base.driver.switchTo().window(webid);
		
		//base.driver.findElement(By.xpath("//button[@class='ajs-button btn btn-primary']")).click();
	}

}
