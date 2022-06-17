package com.pack1;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase1 {

	
@Test
public void testmethod1() {

	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.google.com/");
	WebElement ele = driver.findElement(By.name("q"));
	ele.click();
	ele.sendKeys("Selemium" , Keys.ENTER);
	
	List<WebElement> listname = driver.findElements(By.xpath("//div[@class='yuRUbf']/a"));
	
	for( WebElement element : listname) {
		System.out.println(element.getAttribute("href"));
		
	}
	
	
	driver.quit(); 
	
	// Quit the page
	
	
	
}
	
	
}
	
