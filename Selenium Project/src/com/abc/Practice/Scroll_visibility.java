package com.abc.Practice;

import java.util.NavigableSet;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll_visibility {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\core java(automation)\\Selenium Project\\resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.get("https://demoqa.com/text-box");
		
		Navigation test=driver.navigate();
		test.to("https://demoqa.com/text-box");
		driver.manage().window().maximize();
		WebElement Submit=driver.findElement(By.id("submit"));
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView()", Submit);
		//js.executeScript("window.scrollTo(0,document.body.scrollHight)");
		Submit.click();
		
	}

}
