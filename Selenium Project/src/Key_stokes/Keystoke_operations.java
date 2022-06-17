package Key_stokes;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Keystoke_operations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\core java(automation)\\Selenium Project\\resources\\chromedriver.exe");
		WebDriver obj=new ChromeDriver();
		obj.get("https://opensource-demo.orangehrmlive.com/");
		obj.findElement(By.id("txtUsername")).sendKeys("Admin");
		
	 obj.findElement(By.id("txtUsername")).sendKeys(Keys.CONTROL + "a");
	 obj.findElement(By.id("txtUsername")).sendKeys(Keys.CONTROL + "c");
	 obj.findElement(By.id("txtPassword")).sendKeys(Keys.CONTROL+ "v");
	  obj.findElement(By.name("Submit")).click();
		//obj.findElement(By.id("txtUsername")).sendKeys(Keys.chord("shivani",Keys.CONTROL,"a",Keys.CONTROL,"c",Keys.TAB,Keys.CONTROL,"v"));
		
		
		
		
	}	
}
