
		import java.util.concurrent.TimeUnit;

		import org.openqa.selenium.By;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.chrome.ChromeDriver;
		import TestNG.Basemethods;
		public class loginclass 
		{
		
			public static void main(String[] args) {
				
				
				System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
				WebDriver driver =new ChromeDriver();  
				driver.get("http://www.orangehrm.qedgetech.com/webapp/login.php");
				
				WebElement username =  driver.findElement(By.id("username"));
				username.clear();
				username.sendKeys("admin");
				
				WebElement password  =  driver.findElement(By.id("password"));
				password.clear();
				password.sendKeys("master123");
				
				WebElement login = driver.findElement(By.id("btnsubmit"));
				login.click();
			
				
		
				String alertWindow = driver.getWindowHandle();
				driver.switchTo().window(alertWindow);
				
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


