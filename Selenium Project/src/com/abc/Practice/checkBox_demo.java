package com.abc.Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class checkBox_demo {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\core java(automation)\\Selenium Project\\resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://demoqa.com/text-box");
		driver.manage().window().maximize();

		WebElement fullname = driver.findElement(By.id("userName"));
		fullname.sendKeys("Yogesh Pandit");
		System.out.println(fullname.getAttribute("placeholder"));
		System.out.println(fullname.getText());

		WebElement email = driver.findElement(By.id("userEmail"));
		email.sendKeys("Ypandit17@gmail.com");

		System.out.println(email.getAttribute("placeholder"));
		System.out.println(email.getText());

		WebElement cadrs = driver.findElement(By.id("currentAddress"));
		cadrs.sendKeys("Sainik Nagar Amravati");
		System.out.println(cadrs.getAttribute("placeholder"));
		System.out.println(cadrs.getText());

		WebElement prmAdrs = driver.findElement(By.id("permanentAddress"));
		prmAdrs.sendKeys("Mudiliyar Nagar Amravati");

		// driver.findElement(By.xpath("//button[@id=\"submit\"]")).click();
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//button[@id=\"submit\"]"))).click().perform();
		Thread.sleep(4000);
		 WebElement text = driver.findElement(By.id("item-1"));
		 text.click();
		System.out.println(text.getText()); 
		System.out.println("hello");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/span/label/span[1]")).click();
		act.moveToElement(driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/span/label/span[1]"))).click().perform();
		

		driver.quit();

	}
}
