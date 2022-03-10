package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TC_Customer {
     static Basemethods base;
	public static void main(String[] args)
	{
		base =new Basemethods();
		
		base.openbrowser();
		base.launchERP();
		base.LoginERP();
       base.driver.findElement(By.id("mi_a_customers")).click();		
		
        WebElement customers=base.driver.findElement(By.xpath("//span[@id='ewPageCaption']"));
        String cust=customers.getText();
        if(cust.equals("Customers"))
        {
        	System.out.println("Customer page is displayed....,testcase is passed");
        }
        else 
        {
        	System.out.println("Testcase is failed");
        }
	}

}