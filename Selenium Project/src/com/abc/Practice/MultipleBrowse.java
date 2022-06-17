package com.abc.Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleBrowse {
	public static void main(String[] args) {
		MultipleBrowse obj = new MultipleBrowse();
		obj.BrowserLaunch("Chrome");
		obj.BrowserLaunch("firefox");
		obj.BrowserLaunch("edge");
		

	}

	public void BrowserLaunch(String browser) {

		WebDriver driver = null;
		if (browser.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver","D:\\core java(automation)\\Selenium Project\\resources\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver","D:\\core java(automation)\\Selenium Project\\resources\\geckodriver.exe");
			driver = new FirefoxDriver();
		} else if(browser.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver","D:\\core java(automation)\\Selenium Project\\resources\\msedgedriver.exe");
			driver = new EdgeDriver();
		}else {
			System.out.println("No Browser is available according to requirment");
		}

		driver.get("https://demoqa.com/text-box");
		driver.manage().window().maximize();
		driver.navigate().refresh();
		System.out.println(driver.getCurrentUrl());
		driver.quit();

	}

}
