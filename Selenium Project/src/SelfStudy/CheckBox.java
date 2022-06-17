package SelfStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	public static void main(String[] args) {
		String  Browsername="chrome";
	    WebDriver driver;
	    System.setProperty("webdriver.chrome.driver","D:\\core java(automation)\\Selenium Project\\resources\\chromedriver.exe");
		driver= new ChromeDriver();
	    driver.get("https://demoqa.com/checkbox");
		System.out.println(driver.getTitle());
	    
		driver.findElement(By.className("rct-title")).click();
	
		 driver.quit();
	}

}
