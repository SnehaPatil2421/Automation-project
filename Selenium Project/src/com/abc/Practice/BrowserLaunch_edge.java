package com.abc.Practice;

import org.openqa.selenium.edge.EdgeDriver;

public class BrowserLaunch_edge {
	public static void main(String[] args) {
		//step 1- register driver
		 //webdriver.chrome.deiver=chromedrive path
		 System.setProperty("webdriver.edge.driver","resources\\msedgedriver.exe");
	     //step 2-- we have to Create object of chromedriver
		 EdgeDriver obj=new EdgeDriver();
	     //step 3-Enter the url----get(string url)
		 obj.get("https://demoqa.com/text-box");
	     //obj.navigate().to("https://demoqa.com/text-box");
	 }
}



 
