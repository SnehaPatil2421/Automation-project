package com.abc.Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class oldselectmethod {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\core java(automation)\\Selenium Project\\resources\\chromedriver.exe" );
		WebDriver obj=new ChromeDriver();
		obj.get("https://demoqa.com/select-menu");
		//obj.manage().window().maximize();
		WebElement selectelement = obj.findElement(By.xpath("//select[@id='oldSelectMenu']"));
		Select p=new Select(selectelement);
		
		//approach-1;selectby visible text
		p.selectByVisibleText("White");
	
		//approach-2:select by value;
		
		// p.selectByValue("5");
		 //approach-3:select by index; p.
		// p.selectByIndex(3);
		/*List<WebElement> alloption = p.getOptions();
		for(WebElement option:alloption) {
			if(option.getText().equals("Indigo")) {
				option.click();
				break;
			}
}*/
	}
}
