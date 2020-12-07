package com.orangeHrmLive;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;

public class DataProviderTest {
  @Test(dataProvider = "dpTest")
  public void dt(String uname,String pass) {
	  System.out.println("username: "+uname);
	  System.out.println("password: "+pass);
	  
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\komal\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		
		driver.findElement(By.name("txtUsername")).sendKeys(uname);
		driver.findElement(By.name("txtPassword")).sendKeys(pass);
		driver.findElement(By.name("Submit")).click();
  }

  @DataProvider(name="dpTest")
  public Object[][] dp() {
    return new Object[][] {
      { "test","test123" },
      { "Admin","admin123" },
    };
  }
}
