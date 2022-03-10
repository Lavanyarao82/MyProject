package TestNG;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import TestNG.Basemethods;

public class TG_ADDnewStockitems 
{
	Basemethods base;
  @BeforeMethod
  public void openapp()
  {
	  base=new Basemethods();
	  base.openbrowser();
	  base.launchERP();
	  base.LoginERP();  
  }
  @SuppressWarnings("deprecation")
public void TC_9_Verify_admin_able_to_add_new_stockitem()
  {

		 base=new Basemethods();
      base.openbrowser();
      base.launchERP();
      base.LoginERP();
      
		
		  base.driver.findElement(By.xpath("//li[@id='mi_a_stock_items']")).click();
	      base.driver.findElement(By.xpath("(//span[@data-caption='Add'])[1]")).click();
	      
	      base.driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	    
	      Select category = new Select(base.driver.findElement(By.id("x_Category")));
	      category.selectByVisibleText("mobiles");
	      
	      Select supplier = new Select(base.driver.findElement(By.id("x_Supplier_Number")));
	      supplier.selectByVisibleText("iphone");
	      
	      String snumber=base.driver.findElement(By.xpath("//input[@name='x_Stock_Number']")).getAttribute("value");
	     
	      System.out.println(snumber);
	      
	      base.driver.findElement(By.id("x_Stock_Name")).sendKeys("iPhone 13 pro");
	      
	      Select uom = new Select(base.driver.findElement(By.id("x_Unit_Of_Measurement")));
	      uom.selectByVisibleText("units");
	     
	      base.driver.findElement(By.id("x_Purchasing_Price")).sendKeys("88000");
	      base.driver.findElement(By.id("x_Selling_Price")).sendKeys("120000");
	      base.driver.findElement(By.id("x_Notes")).sendKeys("This is iPhone 13 pro new model");
	    
	      
	      
	      base.driver.findElement(By.id("btnAction")).click();
	      
	     
	     
	      
	      String alertwindow = base.driver.getWindowHandle();
	      base.driver.switchTo().window(alertwindow);
	      
	      base.driver.findElement(By.xpath("//button[@class='ajs-button btn btn-primary']")).click();
	      
	      String alertwindow1 = base.driver.getWindowHandle();
	      base.driver.switchTo().window(alertwindow1);
	      
	      base.driver.findElement(By.xpath("//button[@class='ajs-button btn btn-primary']")).click();
	     //validating 
	      WebElement  text =base.driver.findElement(By.xpath("//span[@class='a_stock_items_Stock_Number']"));
	      String textstock =text.getText();
	      System.out.println("textstock is:" +textstock); 
	    
	      
	      if(snumber.equals(textstock))
	      {
	    	  System.out.println("stock item added successfully,testcase is passed");
	      }
	      else
	      {
	    	  System.out.println("testcase is failed");
	      }
	  
	  
	  
	  
	  
  }
  
  
}
