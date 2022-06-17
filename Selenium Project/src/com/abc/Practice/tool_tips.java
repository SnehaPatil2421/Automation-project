package com.abc.Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class tool_tips {
	public static void main(String[] args) throws InterruptedException {
		
	
	System.setProperty("webdriver.chrome.driver", "D:\\core java(automation)\\Selenium Project\\resources\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://demoqa.com/tool-tips");
	driver.manage().window().maximize();
	Actions action=new Actions(driver);
	//WebElement obj= driver.findElement(By.id("toolTipButton"));
	action.clickAndHold( driver.findElement(By.id("toolTipButton"))).perform();
	Thread.sleep(2000);
	System.out.println(driver.findElement(By.className("tooltip-inner")).getText());
}
}