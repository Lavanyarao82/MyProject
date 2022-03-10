package TestNG;
import org.openqa.selenium.By;

import TestNG.Basemethods;
public class TG_send_Email {
     static Basemethods base;
	public static void main(String[] args) 
	{
		base =new Basemethods();

		base=new Basemethods();
		base.openbrowser();
		base.launchERP();
		base.LoginERP();
		
		base.driver.findElement(By.xpath("//li[@id='mi_a_stock_items']")).click();
		base.driver.findElement(By.xpath("//button[@data-original-title='Export']")).click();
		base.driver.findElement(By.xpath("//a[@id='emf_a_stock_items']")).click();
		
		base.driver.findElement(By.xpath("//input[@id='sender']")).sendKeys("lavanyarao.v@gmail.com");
	
		base.driver.findElement(By.xpath("//input[@id='recipient']")).sendKeys("lavanyarao.v@gmail.com");
		base.driver.findElement(By.xpath("//input[@id='cc']")).sendKeys("lavanyarao.v@gmail.com");
	
		base.driver.findElement(By.xpath("//input[@id='bcc']")).sendKeys("selenium");
	
		base.driver.findElement(By.xpath("//input[@id='subject']")).sendKeys("selenium");
	
		base.driver.findElement(By.xpath("//textarea[@id='message']")).sendKeys("message");
		base.driver.findElement(By.xpath("//button[text()='Send']")).click();
		
		String errmsg= base.driver.getWindowHandle();
		base.driver.switchTo().window(errmsg);
     
		base.driver.findElement(By.xpath("//p[@class='text-danger']"));
		
	//	base.driver.findElement(By.xpath("//
	}

}
