package com.qa.crm.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class paremetr {
	WebDriver driver;
	@Test
	@Parameters({"url","username","password"})
	public void para(String url, String username, String password) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shruthi\\Desktop\\shrusel\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys(password);
	}
	
}
