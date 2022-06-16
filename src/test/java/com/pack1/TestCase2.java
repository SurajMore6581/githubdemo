package com.pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase2 {
	
	WebDriver driver;
		
	@Test
	public void login() {
	
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();	
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");  // URL is OPEN in Chrome Browser 
	driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
	driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	driver.findElement(By.id("btnLogin")).click();
	Assert.assertEquals("OrangeHRM", driver.getTitle());
		
	}
	
	@Test()
	public void verifyText() {
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();	
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");  // URL is OPEN in Chrome Browser

	WebElement ele = driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[2]/div[2]/form/div[5]/div/a"));
	String str = ele.getText();
	System.out.println(str);
	Assert.assertEquals(str , "Forgot your password?");
		
		
	}
	
	@AfterClass
	public void logout() {
		
	driver.quit();
	

	
	}	
}


