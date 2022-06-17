package select;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class new_dropdown_selectClass {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\core java(automation)\\Selenium Project\\resources\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/select-menu");
		driver.manage().window().maximize();
		//1. we will select drop down
		WebElement selectelement=driver.findElement(By.id("withOptGroup"));
	   
		//2. create object of select class
		Select select=new Select(selectelement);
		select.selectByIndex(1);
		
		
		
	}
}
