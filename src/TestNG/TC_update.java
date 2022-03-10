package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TC_update {

	static Basemethods base;
	public static void main(String[] args) 
	{
	    base=new Basemethods();
	    base.openbrowser();
	    
		base.launchERP();
		base.LoginERP();
		base.driver.findElement(By.xpath("//li[@id='mi_a_stock_items']")).click();
		base.driver.findElement(By.xpath("//span[@data-caption='Edit']")).click();
		base.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		WebElement  sname=base.driver.findElement(By.xpath("//input[@id='x_Stock_Name']"));
		
		
		sname.clear();
		sname.sendKeys("myna");
		
		
	//	base.driver.findElement(By.xpath("//button[@class='ajs-button btn btn-primary']")).click();
		
		base.driver.findElement(By.xpath("//button[@id='btnAction']")).click();

		String winid=base.driver.getWindowHandle();
	base.driver.switchTo().window(winid);
		
	base.driver.findElement(By.xpath("//button[@class='ajs-button btn btn-primary']")).click();


	}

}
