package com.abc.Practice;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextBox {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","D:\\core java(automation)\\Selenium Project\\resources\\chromedriver.exe");
	 WebDriver driver= new ChromeDriver();//here we take reference of webdriver interface and create object of class chromedriver
	 driver.get("https://demoqa.com/text-box");
	 driver.manage().window().maximize();
     try
     {
	 //first step to find element
	 WebElement txtusername=driver.findElement(By.id("userName"));
     txtusername.sendKeys("firstname");
     
     
     //get attribute method is to use to read the property of tag
     //placeholder is one of property of user field
     System.out.println("placeholder - "+txtusername.getAttribute("placeholder"));
     System.out.println("value - "+txtusername.getAttribute("value"));
     System.out.println("label - "+txtusername.getText());
     txtusername.clear();//whatever has been enter in first name 
     System.out.println("it will retrive tag name" +txtusername.getTagName());
     }catch(NoSuchElementException p)
     {
    	 p.printStackTrace();
     }
     //sendkey method help to enter value
     WebElement txtemail=driver.findElement(By.id("userEmail"));
     txtemail.sendKeys("test@test.com");
     
     //clear()- it will remove value which we already enter
     //step 1- find element
     //step 2- clear
     
     
     System.out.println(driver.findElement(By.id("userName-label")).getText());
     driver.findElement(By.id("submit")).click();
     }
     }

 