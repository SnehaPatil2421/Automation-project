package com.abc.Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Manu_Item {
  public static void main(String[] args) throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "D:\\core java(automation)\\Selenium Project\\resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/menu");
		driver.manage().window().maximize();
		Actions action=new Actions(driver);
		action.clickAndHold(driver.findElement(By.xpath("//ul[@id=\"nav\"]/li[2]/a"))).perform();;
		Thread.sleep(2000);
		action.clickAndHold(driver.findElement(By.xpath("//ul[@id=\"nav\"]/li[2]/ul/li[3]/a"))).perform();
		action.clickAndHold(driver.findElement(By.xpath("//ul[@id=\"nav\"]/li[2]/ul/li[3]//li/a"))).perform();;
		
}
}
