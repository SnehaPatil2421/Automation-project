package com.abc.Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class chromeBrowser {

	public static void main(String[] args) throws InterruptedException {
	    String  Browsername="chrome";
	    WebDriver driver;
	    if(Browsername.equalsIgnoreCase("chrome"))
	    {
		System.setProperty("webdriver.chrome.driver","D:\\core java(automation)\\Selenium Project\\resources\\chromedriver.exe");
		driver= new ChromeDriver();//here we take reference of webdriver interface and create object of class chromedriver
		
		//obj.navigate().to("https://web.whatsapp.com/");
	/*	obj.manage().window().maximize();
	     obj.navigate().refresh();
	     obj.navigate().back();
	     Thread.sleep(1000);
	     obj.navigate().forward();
	     System.out.println(obj.getTitle());
	     System.out.println(obj.getPageSource());
	     System.out.println(obj.getCurrentUrl());
	    // obj.close();*/
	   }
	    else if(Browsername.equalsIgnoreCase("edge")){
	    	System.setProperty("webdriver.edge.driver", "D:\\core java(automation)\\Selenium Project\\resources\\msedgedriver.exe");
	        driver=new EdgeDriver();
	       
	    }
	    else
	    {
	   //launch firefox
	   System.setProperty("webdriver.gecko.driver", "D:\\core java(automation)\\Selenium Project\\resources\\geckodriver.exe");
	   driver=new FirefoxDriver();
	   
	    }/*
	    System.setProperty("webdriver.chrome.driver","D:\\core java(automation)\\Selenium Project\\resources\\chromedriver.exe");
		driver= new ChromeDriver();
	    driver.get("https://demoqa.com/checkbox");
		System.out.println(driver.getTitle());
	    //driver.quit();
		driver.findElement(By.className("rct-title")).click();*/
	
	}
	
	}


