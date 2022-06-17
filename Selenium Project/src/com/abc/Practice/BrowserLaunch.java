package com.abc.Practice;
import org.openqa.selenium.chrome.ChromeDriver;
public class BrowserLaunch {
	public static void main(String[] args) {
		//step 1- register driver/property set
		 //webdriver.chrome.deiver=chromedrive path
		 System.setProperty("webdriver.chrome.driver","D:\\core java(automation)\\Selenium Project\\resources\\chromedriver.exe");
	     //step 2-- we have to Create object of chromedriver
		 ChromeDriver obj=new ChromeDriver();
  	     //step 3-Enter the url----get(string url)
		 obj.get("https://demoqa.com/text-box");
	     //obj.navigate().to("https://demoqa.com/text-box");
		
		System.out.println(obj.getTitle());//to read title of page---gettitle 
		
		System.out.println(obj.getCurrentUrl());//get current url
		
		System.out.println(obj.getPageSource());//to read page source ---html code of page
		
		obj.navigate().refresh();//to refersh the page
		
		//obj.close();//to close the browsre
		/*Options t=obj.manage();
		 * Window p=t.Window();
		 * p.maximize();*/	
		obj.manage().window().maximize();
		obj.manage().window().fullscreen();
		//obj.manage().window().notifyAll();
		//obj.manage().getCookies();
		
	 }
} 