package com.orangeHrmLive;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class XMLTest {

  @Parameters({"uname","pass"})
  @Test
  public void f(String user,String pwd) {
	  
	  	System.setProperty("webdriver.chrome.driver","C:\\Users\\komal\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		
		driver.findElement(By.name(user)).sendKeys("Admin");
		driver.findElement(By.name(pwd)).sendKeys("admin123");
		//driver.findElement(By.name("Submit")).click();
  }
}
