package com.abc.Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class COMMONBROWSERLAUNCH {
	 public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=null;
		String browsername="firefox";
		
		if(browsername.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver","D:\\core java(automation)\\Selenium Project\\resources\\chromedriver.exe");
			driver = new ChromeDriver();
			
		}
		else if(browsername.equalsIgnoreCase("edge")) {
		System.setProperty("webdriver.edge.driver","D:\\core java(automation)\\Selenium Project\\resources\\msedgedriver.exe");
		driver= new EdgeDriver();
		
		}
		else {
			System.setProperty("webdriver.gecko.driver","D:\\core java(automation)\\Selenium Project\\resources\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		driver.get("https://www.facebook.com");
		System.out.println("tile: " + driver.getTitle());
		System.out.println("pagesource: "+ driver.getPageSource());
		System.out.println("current url: " + driver.getCurrentUrl());
		driver.close();
		
	
	
	}
}
