package com.abc.Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver","D:\\core java(automation)\\Selenium Project\\resources\\chromedriver.exe");
			ChromeDriver driver = new ChromeDriver();
			driver.get("https://demoqa.com/droppable");
           Actions action=new Actions(driver);
           WebElement src=driver.findElement(By.id("draggable"));
           WebElement tar=driver.findElement(By.id("droppable"));
           action.dragAndDrop(src, tar).perform();
             driver.quit();
	}

}
