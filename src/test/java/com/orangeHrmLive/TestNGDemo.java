package com.orangeHrmLive;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGDemo 
{
	WebDriver driver;
	
	@Test(priority=1)
	public void test()
	{
	  System.out.println("TestNG Demo");
	}
	
	/*@Test(priority=2)
	public  void openBrowser()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\komal\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
	}*/
	
	/*@Test(priority=3)
	public  void openUrl()
	{ 
	   driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
	}*/
	
	@BeforeClass
		public  void openBrowser()
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\komal\\Downloads\\chromedriver_win32\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		}
		
	//@Test(priority=4)
	@BeforeMethod
	public  void login()
	{  
	   driver.findElement(By.name("txtUsername")).sendKeys("Admin");
	   driver.findElement(By.name("txtPassword")).sendKeys("admin123");
	   driver.findElement(By.name("Submit")).click();
	}
	
	
	@Test
	public void adminTest()
	{
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.findElement(By.linkText("Admin")).click();
	}
	
	@Test
	public void leaveTest()
	{
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.findElement(By.linkText("Leave")).click();
	}
	
	@Test
	public void pimTest()
	{
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.findElement(By.linkText("PIM")).click();
	}
	
	//@Test(priority=5)
		@AfterMethod
		public  void logOut()
		{ 
			driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
			driver.findElement(By.id("welcome")).click();
			driver.findElement(By.xpath("//*[@id=\"welcome-menu\"]/ul/li[2]/a")).click();
		}

	@AfterClass
	public void closeBrowser()
	{
		driver.close();
	}

}
