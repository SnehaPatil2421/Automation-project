package com.abc.Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\core java(automation)\\Selenium Project\\resources\\chromedriver.exe ");
		//When you create object then automatically browser will launch
		ChromeDriver driver=new ChromeDriver(); //driver is a reference of chromedriver class
		//Enter the URL which you want to enter in the browser
		driver.get("https://demoqa.com/radio-button");
		
		//WHY IT IS NOT CLICKED -->EXPLAIN --what to do
		//WebElement YesRadioButton=driver.findElement(By.xpath("//input[@id='yesRadio']"));
		WebElement YesRadioButton=driver.findElement(By.xpath("//label[@for='yesRadio']"));
		YesRadioButton.click();
		WebElement NORadioButton=driver.findElement(By.xpath("//input[@id='noRadio']"));
		System.out.println(NORadioButton.isEnabled());
		if(!NORadioButton.isEnabled()) {
			System.out.println("Radio button is disable- Test Case pass");
		} else {
			System.out.println("Radio button is enable- Test Case Fail");
		}
			
		//Aproach 1- We create sepparate locator for each column using text()--//div[text()='First Name']
	    // Aproach 2 -We will create common locator for all the columns and use iterator --> //div[@role='columnheader']
	
	}

}

