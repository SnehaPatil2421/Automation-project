package SelfStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkbox_approach2 {
	public static void main(String[] args) {
		
	
	System.setProperty("webdriver.chrome.driver","D:\\core java(automation)\\Selenium Project\\resources\\chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://demoqa.com/checkbox");
	WebElement  HomeCheckbox=driver.findElement(By.xpath("//label[@for=\"tree-node-home\"]"));
	//HomeCheckbox.click();
	if(!HomeCheckbox.isSelected())
	{
		System.out.println("i am in loop ");
		HomeCheckbox.click();
	}
	else
	{
		 System.out.println("checkbox is already selected");
	}
	WebElement Result=driver.findElement(By.id("result"));
	System.out.println(Result.getText());
	driver.quit(); 
	
	}
}