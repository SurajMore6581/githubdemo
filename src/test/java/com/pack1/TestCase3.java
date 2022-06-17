package com.pack1;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase3 {

@Test
public void javaScriptExmplae() throws InterruptedException {
	
WebDriverManager.chromedriver().setup();
WebDriver driver = new ChromeDriver();

driver.get("https://selectorshub.com/");

driver.manage().window().maximize();
JavascriptExecutor js = (JavascriptExecutor) driver ;

//ScrollDown the page 
js.executeScript("window.scrollBy(0 , document.body.scrollHeight)");

//ScrollUP the page by specific  location
js.executeScript("window.scrollBy(0 , -350)"  , "");


Thread.sleep(10000);
driver.close();
	
}
	
	
	
	
}
