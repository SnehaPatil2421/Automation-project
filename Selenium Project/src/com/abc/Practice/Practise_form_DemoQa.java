package com.abc.Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practise_form_DemoQa {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\core java(automation)\\Selenium Project\\resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("firstName")).sendKeys("Yogesh");
		driver.findElement(By.id("lastName")).sendKeys("Pandit");
		driver.findElement(By.id("userEmail")).sendKeys("ypandit@gmail.com");
		
		driver.findElement(By.xpath("//label[@for=\"gender-radio-1\"]")).click();
		driver.findElement(By.id("userNumber")).sendKeys("8788459429");
       // driver.findElement(By.className("subjects-auto-complete_value-container subjects-auto-complete_value-container--is-multi css-1hwfws3")).sendKeys("To get resume for job allocation");;
		
		driver.findElement(By.xpath("//label[@for='hobbies-checkbox-3']")).click();
		driver.findElement(By.id("currentAddress")).sendKeys("DHayari pune");
		
		
		
		

	}
}
