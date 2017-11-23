package com.cybage.alm.ZephyrJenkins.ZephyrJenMaven;


import java.net.MalformedURLException;
import java.net.URL;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class LoginTest {
	
	
	static String baseUrl;
	static String hubUrl;
	public static WebDriver driver;

	@Test()
	public void apositiveTest() throws MalformedURLException {
		System.out.println("POSITIVE");
		baseUrl="http://newtours.demoaut.com";
		driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");

		driver.get(baseUrl);
		//driver=new RemoteWebDriver(new URL(hubUrl),DesiredCapabilities.firefox());
		WebElement user = driver.findElement(By.name("userName"));
		user.sendKeys("mercury");
		WebElement pass = driver.findElement(By.name("password"));
		pass.sendKeys("mercury");
		driver.findElement(By.name("login")).click();
		driver.quit();
	}
	
/*
	@Test
	public void bnegativeTest() throws MalformedURLException {
		System.out.println("NEGATIVE");
		try {
			baseUrl="http://newtours.demoaut.com";
			driver = new FirefoxDriver();
			driver.get("http://newtours.demoaut.com");
			driver.get(baseUrl);
			WebElement user = driver.findElement(By.name("userName"));
			user.sendKeys("mercury");
			WebElement pass = driver.findElement(By.name("password"));
			pass.sendKeys("mercury");
			driver.findElement(By.name("login0")).click();
		} finally {
			driver.quit();
		}
	}
	
	@Test
	public void cdummyTest() throws MalformedURLException {
		System.out.println("DUMMY");
		try {
			baseUrl="http://newtours.demoaut.com";
			driver = new FirefoxDriver();
			driver.get("http://newtours.demoaut.com");
			driver.get(baseUrl);
			WebElement user = driver.findElement(By.name("userName"));
			user.sendKeys("mercury");
			WebElement pass = driver.findElement(By.name("password"));
			pass.sendKeys("mercury");
			driver.findElement(By.name("login0")).click();

		} finally {
			driver.quit();
		}
	}*/

}
