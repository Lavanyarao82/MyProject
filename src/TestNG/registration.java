package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class registration {
   static Basemethods base;
	@SuppressWarnings("deprecation")
	public static void main(String[] args)
	{
		base=new Basemethods();
		base.openbrowser();
		base.launchERP();
		base.driver.findElement(By.xpath("//a[@href='register.php']")).click();
		base.driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		base.driver.findElement(By.xpath("//button[@id='btnsubmit']")).click();

		base.driver.findElement(By.xpath("//input[@id='x_Username']")).sendKeys("lavanya");
		
		WebElement password=base.driver.findElement(By.xpath("//input[@id='x_Password']"));
				password.sendKeys("lavanya@123");
		WebElement cpass=base.driver.findElement(By.xpath("//input[@id='c_Password']"));
	
				cpass.sendKeys("lavanya@123");
		
				
		base.driver.findElement(By.xpath("//input[@id='x_First_Name']")).sendKeys("jasri");	
		base.driver.findElement(By.xpath("//input[@id='x_Last_Name']")).sendKeys("velaga");
		base.driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("lavanyarao.v@gmail.com");
	
		base.driver.findElement(By.xpath("//button[@id='btnAction']")).click();
	}

}
