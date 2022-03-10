package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.support.ui.Select;

public class TC_stockitem {
  static Basemethods base;
	
	public static void main(String[] args) 
	{ 
		base =new Basemethods();
		base.openbrowser();
		base.launchERP();
		base.LoginERP();
	
		WebElement stock= base.driver.findElement(By.id("mi_a_stock_items"));
		stock.click();
		WebElement sitems=base.driver.findElement(By.xpath("//span[@id='ewPageCaption']"));
		
		 String items=sitems.getText();
		 if(items.equals("Stock Items"))
		 {
			 System.out.println("stock items page is displayed,testcase is passed");
		 }
		 else 
		 {
			 System.out.println("testcase is failed");
		 }

	}

}
