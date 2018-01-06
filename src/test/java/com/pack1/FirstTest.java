package com.pack1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FirstTest {
	
	@Test
	public void launch() {
		
		
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://mvnrepository.com/artifact/org.testng/testng/6.13.1");
		driver.manage().window().maximize();
		
	}

}
