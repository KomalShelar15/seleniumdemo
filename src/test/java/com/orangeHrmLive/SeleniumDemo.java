package com.orangeHrmLive;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDemo {

	WebDriver driver;
	public  void openBrowser()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\komal\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 driver=new ChromeDriver();
	}
	 
	public  void openUrl()
	{ 
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		//driver.get("http://127.0.0.1:5500/login.html");
	}
	public  void login()
	{  
	   driver.findElement(By.name("txtUsername")).sendKeys("Admin");
	  
	   driver.findElement(By.name("txtPassword")).sendKeys("admin123");
	  
	   driver.findElement(By.name("Submit")).click();
	   
	   
	   //for this demo use login.html file in C:\xampp\htdocs\200245920062\login.html
//	   driver.findElement(By.name("nm")).sendKeys("Admin");
	  
//	   driver.findElement(By.name("pwd")).sendKeys("admin123");
	  
//	   driver.findElement(By.name("btn")).click();
	}
	public static void main(String[] args) {
		SeleniumDemo sd=new SeleniumDemo();
		sd.openBrowser();
		sd.openUrl();
		sd.login();
		
		 /* //step: 1) open browser //download Zip file from
		  //->>https://chromedriver.storage.googleapis.com/86.0.4240.22/chromedriver_win32.zip //then extarct it and copy the path of .exe file and
		  // paste it in setProperty in " " System.setProperty("webdriver.chrome.driver", "C:\\Users\\komal\\Downloads\\chromedriver_win32\\chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		  
		  //step: 2) openUrl-> orangeHrm site
		  driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		  
		  //step: 3) locate the userName element and pass test data into it //go to
		  //browser ->right click on userName textBox->inspect->then copy input name from
		 // this->paste it in->by.name(" ")-> //in sendKeys() give userName that u want to use while login
		  driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		  driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		  driver.findElement(By.name("Submit")).click();
		 */
		

	}

}
