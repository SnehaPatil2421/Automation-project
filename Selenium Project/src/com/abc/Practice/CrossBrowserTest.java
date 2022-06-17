package com.abc.Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CrossBrowserTest {
	
	 WebDriver obj1;

	public static void main(String[] args) {
		CrossBrowserTest obj = new CrossBrowserTest();
		obj.openBrowser("chrome");
		obj.openBrowser("firefox");
		obj.openBrowser("edge");

	}

	public void openBrowser(String browser) {
		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver","D:\\core java(automation)\\Selenium Project\\resources\\chromedriver.exe");

			obj1= new ChromeDriver();

		}
		if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver","D:\\core java(automation)\\Selenium Project\\resources\\geckodriver.exe");
			obj1 = new FirefoxDriver();

		}
		if (browser.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver","D:\\core java(automation)\\Selenium Project\\resources\\msedgedriver.exe");
			obj1 = new EdgeDriver();
		}
		obj1.get("https://demoqa.com/text-box");
		obj1.manage().window().maximize();
		obj1.navigate().refresh();
		System.out.println(obj1.getCurrentUrl());
		obj1.quit();

	}
}
