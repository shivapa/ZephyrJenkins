package com.cybage.alm.ZephyrJenkins.ZephyrJenMaven;

import java.net.MalformedURLException;
import java.net.URL;

import org.junit.Assert;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class ChecktitleTest {
//	static String baseUrl;
	//static String hubUrl;
	public static WebDriver driver;

	@Test
	public void checkTitle() throws MalformedURLException {
		//baseUrl = "http://newtours.demoaut.com";
		
		driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
		//driver.get(baseUrl);

		System.out.println(driver.getTitle());
		Assert.assertEquals("Welcome: Mercury Tours", driver.getTitle());

		driver.quit();
	}

}
