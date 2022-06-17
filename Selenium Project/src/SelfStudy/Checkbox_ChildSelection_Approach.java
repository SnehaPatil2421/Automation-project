package SelfStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox_ChildSelection_Approach {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\core java(automation)\\Selenium Project\\resources\\chromedriver.exe");
		ChromeDriver obj=new ChromeDriver();
		obj.get("https://demoqa.com/checkbox");
		
		obj.manage().window().maximize();
		obj.findElement(By.id("item-0")).click();
		WebElement txtname= obj.findElement(By.id("userName"));
		txtname.sendKeys("shivani");
		WebElement txtemail= obj.findElement(By.id("userEmail"));
		txtemail.sendKeys("shivani123@gmail.com");
		WebElement currentadd= obj.findElement(By.id("currentAddress"));
		currentadd.sendKeys("BIHAR");
		WebElement permanentadd= obj.findElement(By.id("permanentAddress"));
		permanentadd.sendKeys("BIHAR");
		//obj.findElement(By.id("submit")).click();//for submit there are ads so clickintercepted exception come
		obj.findElement(By.id("item-1")).click();
		obj.findElement(By.xpath("//button[@title='Toggle']")).click();
		Thread.sleep(4000);
		obj.findElement(By.xpath("//label[@for='tree-node-desktop']")).click();
		//obj.findElement(By.xpath("//label[@for='tree-node-notes']")).click();
		//obj.findElement(By.xpath("//label[@for='tree-node-commands']")).click();

		obj.findElement(By.xpath("//label[@for='tree-node-documents']")).click();
		obj.findElement(By.xpath("//label[@for='tree-node-workspace']")).click();
		//obj.findElement(By.xpath("//label[@for='tree-node-office']")).click();
	
		obj.findElement(By.xpath("//label[@for='tree-node-downloads']")).click();
		//obj.findElement(By.xpath("//label[@for='tree-node-wordFile']")).click();
		//obj.findElement(By.xpath("//label[@for='tree-node-excelFile']")).click();
         obj.quit();

	
	}
}
