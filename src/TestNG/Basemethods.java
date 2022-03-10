package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Basemethods
{
   public WebDriver driver;
public void openbrowser()
{
	
	System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	 driver =new ChromeDriver();  
	driver.manage().window().maximize();
}
   public void launchERP()
{
	driver.get("http://www.orangehrm.qedgetech.com/webapp/login.php");
	
}
  public void LoginERP()
  {

		WebElement username =  driver.findElement(By.id("username"));
		username.clear();
		username.sendKeys("admin");
		
		WebElement password  =  driver.findElement(By.id("password"));
		password.clear();
		password.sendKeys("master");
		
		WebElement login = driver.findElement(By.id("btnsubmit"));
		login.click();
		
		WebElement pageName = driver.findElement(By.id("ewPageCaption"));
		String name = pageName.getText();
		
		if(name.equals("Dashboard")) 
		{
			System.out.println("Login is successful, Testcase is passed..");
		} else 
		{
			System.out.println("Testcase is failed, unable to Login");
		}

  }
  public void Logout()
  {

	driver.findElement((By.xpath("//li[@id='mi_logout']"))).click();
	
	 WebElement login = driver.findElement(By.id("btnsubmit"));
	 login.click();
	if(login.isEnabled())
	{
		System.out.println("Logout is successful, Testcase is passed..");
	} else {
		System.out.println("Logout is not successful, Testcase is failed..");
	} 
  }
public void loginERP1(String uname, String pass) 
{
		
	    WebElement username =  driver.findElement(By.id("username"));
		username.clear();
		username.sendKeys(uname);
		
		WebElement password  =  driver.findElement(By.id("password"));
		password.clear();
		password.sendKeys(pass);
		
		WebElement login = driver.findElement(By.id("btnsubmit"));
		login.click();
		
	//	String alertWindow = driver.getWindowHandle();
		//driver.switchTo().window(alertWindow);
		
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		WebElement eMesg = driver.findElement(By.xpath("//div[contains(text(),'Incorrect')]"));
		String actResult = eMesg.getText();
		
		if(actResult.contains("Incorrect")) {
			System.out.println("Login is not successful, Testcase is passed..");
		} else {
			System.out.println("Testcase is failed..");
		}
  }
	
}
