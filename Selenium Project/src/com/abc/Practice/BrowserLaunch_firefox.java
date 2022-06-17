package com.abc.Practice;

import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserLaunch_firefox {
	public static void main(String[] args) {
		//step 1- register driver
		 //webdriver.chrome.deiver=chromedrive path
		 System.setProperty("webdriver.gecko.driver","D:\\core java(automation)\\Selenium Project\\resources\\geckodriver.exe");
	     //step 2-- we have to Create object of chromedriver
		 FirefoxDriver obj=new FirefoxDriver();
	     //step 3-Enter the url----get(string url)
		 obj.get("https://demoqa.com/text-box");
	     //obj.navigate().to("https://demoqa.com/text-box");
		 System.out.println(obj.getTitle());//to read title of page----gettitle
		 
	 }
}
