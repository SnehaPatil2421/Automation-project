package com.abc.Practice;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Parent_Webdriver {
public static void main(String[] args)  {
		
		String Browsername = "firefox";

		if (Browsername.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver","D:\\core java(automation)\\Selenium Project\\resources\\chromedriver.exe");

			ChromeDriver driver2 = new ChromeDriver();
			driver2.get("https://demoqa.com/text-box");
			driver2.manage().window().maximize();
			driver2.navigate().refresh();
			System.out.println(driver2.getCurrentUrl());
			driver2.quit();
			
			
		} else if (Browsername.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver","D:\\core java(automation)\\Selenium Project\\resources\\msedgedriver.exe");
			EdgeDriver driver = new EdgeDriver();
			driver.get("https://demoqa.com/text-box");
			driver.manage().window().maximize();
			driver.navigate().refresh();
			System.out.println(driver.getCurrentUrl());
			driver.quit();
			
			
		} else if(Browsername.equalsIgnoreCase("firefox")){
			System.setProperty("webdriver.gecko.driver","D:\\core java(automation)\\Selenium Project\\resources\\geckodriver.exe");
			FirefoxDriver driver1 = new FirefoxDriver();
			driver1.get("https://demoqa.com/text-box");
			driver1.manage().window().maximize();
			driver1.navigate().refresh();
			System.out.println(driver1.getCurrentUrl());
			driver1.quit();
			
			
		}
		
		

	}

}
