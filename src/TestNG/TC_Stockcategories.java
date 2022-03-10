package TestNG;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import TestNG.Basemethods;

public class TC_Stockcategories {
 
	static Basemethods base;
	
	public static void main(String[] args) 
	{
	     base =new Basemethods();
	     base.openbrowser();
	     base.launchERP();
	     base.LoginERP();
	   WebElement stock=  base.driver.findElement(By.xpath("//li[@id='mi_a_stock_items']"));
	     Actions act=new Actions(base.driver);
	     act.moveToElement(stock).build().perform();
	     base.driver.findElement(By.xpath("//li[@id='mi_a_stock_categories']")).click();
	  WebElement category=base.driver.findElement(By.xpath("//span[@id='ewPageCaption']")); 
	    String cat=category.getText();
	    if(cat.equals("Stock Categories"))
	    {
	    	System.out.println("stock categories page is displayed.....,testcase is passed ");
	    }
	    else {
	    	System.out.println("testase s failed");
	    }
	    
        
	}

}
