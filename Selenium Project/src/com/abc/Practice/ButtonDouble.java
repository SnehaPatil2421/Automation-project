package com.abc.Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ButtonDouble {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/buttons");
		//Mouse actions
		Actions act=new Actions(driver);
        act.doubleClick(driver.findElement(By.id("doubleClickBtn")));
      //WebElement obj=driver.findElement(By.id("doubleClickBtn\"));
        //act.doubleClick(obj);
		act.perform();
		WebElement Result=driver.findElement(By.id("doubleClickMessage"));
		System.out.println(Result.getText());
		
		
		//for right click button
		  act.contextClick(driver.findElement(By.id("rightClickBtn")));
		  act.perform();
		  WebElement Res=driver.findElement(By.id("dynamicClickMessage"));
			System.out.println(Res.getText());
		
        
		
	}
}
