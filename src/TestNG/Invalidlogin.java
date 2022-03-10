package TestNG;
import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import TestNG.Basemethods;

public class Invalidlogin {
      static Basemethods base;
   
	public static void main(String[] args)
	{
		base=new Basemethods();
		
        base.openbrowser();
        base.launchERP();
        base.loginERP1("admin", "master123");

	}
}

